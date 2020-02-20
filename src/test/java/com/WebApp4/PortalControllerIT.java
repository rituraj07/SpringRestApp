package com.WebApp4;

import com.WebApp.DemoApplication;
import com.WebApp.Topic.pojo.Topic;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PortalControllerIT {
//ner;
////import org.springframework.web.multipart.MultipartFile;
////
////import com.fasterxml.jackson.core.JsonParseException;
////import com.fasterxml.jackson.core.type.TypeReference;
////import com.fasterxml.jackson.databind.JsonMappingException;
    @LocalServerPort
    private int port;
//
    @Autowired
    private ObjectMapper mapper;

    private final String portalBaseURL = IntegrationTestingConstants.PORTAL_BASE_URL;

    TestRestTemplate restTemplate = new TestRestTemplate();
    HttpHeaders headers = new HttpHeaders();
//
    @Before
    public void before() {
        headers.add("Authorization", IntegrationTestingConstants.BEARER_TOKEN);
    }
//
    private String createURLWithPort(String uri)
    {
        return "http://localhost:" + port + uri;
    }

//
//    private PortalConfigurationModel getPortalConfigurationModelObject(String portalConfigurationModelJSONString) throws JsonParseException, JsonMappingException, IOException {
//        return mapper.readValue(
//                portalConfigurationModelJSONString, PortalConfigurationModel.class);
//    }
//
//    private List<BucketConfiguration> getBucketConfigurationList(PortalConfigurationModel portalConfigurationModel){
//        return portalConfigurationModel.getBucketList();
//    }
//
//    private List<CustomURLMapper> getCustomURLMapperList(String customURLMapperJSONString) throws JsonParseException, JsonMappingException, IOException{
//        return mapper.readValue(customURLMapperJSONString, new TypeReference<List<CustomURLMapper>>() {});
//    }
//
//    private CustomURLMapper getCustomURLMapperObject(String customURLMapperJSONString) throws JsonParseException, JsonMappingException, IOException {
//        return mapper.readValue(customURLMapperJSONString,CustomURLMapper.class);
//    }
//
//    private ClaimUnclaimInput getClaimUnclaimInputObject(String claimUnclaimInputJSONString) throws JsonParseException, JsonMappingException, IOException {
//        return mapper.readValue(claimUnclaimInputJSONString, ClaimUnclaimInput.class);
//    }
//
//    private PortalCommentHistory getPortalCommentHistoryObject(String portalCommentHistoryJSONString) throws JsonParseException, JsonMappingException, IOException {
//        return mapper.readValue(portalCommentHistoryJSONString,PortalCommentHistory.class);
//    }
//
    @Test
    public void testGetAllTopics() throws JSONException {
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);

        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/topics"),
                HttpMethod.GET, entity, String.class);

        JSONAssert.assertEquals(IntegrationTestingConstants.DEMO_RESPONSE, response.getBody(), false);
    }


//
//    @Test
//    public void testGetTabConfig() {
//        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
//
//        ResponseEntity<String> response = restTemplate.exchange(
//                createURLWithPort(portalBaseURL + IntegrationTestingConstants.GET_TAB_CONFIG_URL),
//                HttpMethod.GET, entity, String.class);
//
//        JSONAssert.assertEquals(IntegrationTestingConstants.GET_TAB_CONFIG_RESPONSE, response.getBody(), false);
//    }
//
//    @Test
//    public void testGetProductConfig() throws JsonParseException, JsonMappingException, IOException {
//        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
//
//        ResponseEntity<String> response = restTemplate.exchange(
//                createURLWithPort(portalBaseURL + IntegrationTestingConstants.GET_PRODUCT_CONFIG_URL),
//                HttpMethod.GET, entity, String.class);
//
//        Map<String,Object> portalConfigurationModelMap = CommonHelperFunctions.getHashMapFromJsonString(response.getBody());
//        ObjectMapper mapper = new ObjectMapper();
//        List<PortalConfigurationModel> portalConfigurationModels = mapper.readValue(new Gson().toJson(portalConfigurationModelMap.get("data")),
//                new TypeReference<List<PortalConfigurationModel>>() {
//                });
//        assertEquals(IntegrationTestingConstants.USER_ID, portalConfigurationModels.get(0).getUserId());
//    }
//
//    @Test
//    public void testGetCardConfig() {
//        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
//
//        ResponseEntity<String> response = restTemplate.exchange(
//                createURLWithPort(portalBaseURL + IntegrationTestingConstants.GET_CARD_CONFIG_URL),
//                HttpMethod.GET, entity, String.class);
//
//        JSONAssert.assertEquals(IntegrationTestingConstants.GET_CARD_CONFIG_SUB_RESPONSE, response.getBody(), false);
//    }
//
//    @Test
//    public void testGetConfigurePortal() {
//        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
//
//        ResponseEntity<String> response = restTemplate.exchange(
//                createURLWithPort(portalBaseURL + IntegrationTestingConstants.GET_CONFIGURE_PORTAL_URL),
//                HttpMethod.GET, entity, String.class);
//
//        assertEquals("kulizaPersonalLoan1", CommonHelperFunctions.getHashMapFromJsonString(CommonHelperFunctions.getJsonString
//                (CommonHelperFunctions.getHashMapFromJsonString(response.getBody()).get("data"))).get("productType").toString());
//    }
//
//    @Test
//    public void testGetAssignedCaseList() {HttpEntity<String> entity = new HttpEntity<String>(null, headers);
//
//        ResponseEntity<String> response = restTemplate.exchange(
//                createURLWithPort(portalBaseURL + IntegrationTestingConstants.GET_ASSIGNED_CASE_LIST_URL),
//                HttpMethod.GET, entity, String.class);
//
//        JSONAssert.assertEquals(IntegrationTestingConstants.GET_ASSIGNED_CASE_LIST_RESPONSE, response.getBody(), false);
//
//    }
//
//
//
//    @Test
//    public void updateConfigurePortal() throws JsonParseException, JsonMappingException, IOException{
//        HttpEntity<PortalConfigurationModel> entity = new HttpEntity<PortalConfigurationModel>
//                (getPortalConfigurationModelObject(IntegrationTestingConstants.PORTAL_CONFIGURATION_MODEL_JSON_STRING), headers);
//
//        ResponseEntity<String> response = restTemplate.exchange(
//                createURLWithPort(portalBaseURL + IntegrationTestingConstants.UPDATE_CONFIGURE_PORTAL_URL),
//                HttpMethod.PUT, entity, String.class);
//
//        assertEquals("Personal Loan ----",getPortalConfigurationModelObject(CommonHelperFunctions.getJsonString
//                (CommonHelperFunctions.getHashMapFromJsonString(response.getBody()).get("data"))).getProductLabel());
//
//    }
//
    @Test
    public void addTopic() throws JsonParseException, JsonMappingException, IOException {
        Topic topic = new Topic("three","three","three");
        HttpEntity<Topic> entity = new HttpEntity<Topic>(topic,headers);

        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/topics"),
                HttpMethod.POST, entity, String.class);

        assertEquals(200,response.getStatusCodeValue());
    }
    @Test
    public void testUpdateTopic() throws JsonParseException, JsonMappingException, IOException {
        Topic topic = new Topic("three","three","three");
        HttpEntity<Topic> entity = new HttpEntity<Topic>(topic,headers);

        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/topics/"+topic.getId()),
                HttpMethod.PUT, entity, String.class);

        assertEquals(200,response.getStatusCodeValue());
    }
    @Test
    public void testDeleteTopic() throws JsonParseException, JsonMappingException, IOException {
        HttpEntity<String> entity = new HttpEntity<String>(null,headers);
        String topic = "three";
        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/topics/"+topic),
                HttpMethod.DELETE, entity, String.class);

        assertEquals(200,response.getStatusCodeValue());
    }
//
//    @Test
//    public void createCustomURLMapping() throws JsonParseException, JsonMappingException, IOException {
//        HttpEntity<List<CustomURLMapper>> entity = new HttpEntity<List<CustomURLMapper>>(
//                getCustomURLMapperList(IntegrationTestingConstants.CUSTOM_URL_MAPPER_REQUEST_BODY_LIST), headers);
//
//
//        ResponseEntity<String> response = restTemplate.exchange(
//                createURLWithPort(portalBaseURL + IntegrationTestingConstants.POST_CREATE_URL_MAPPING_URL),
//                HttpMethod.POST, entity, String.class);
//
//        assertEquals(42L,getCustomURLMapperList(new Gson().toJson(CommonHelperFunctions.getHashMapFromJsonString(response.getBody()).get("data"))).get(0).getId());
//    }
//
//    @Test
//    public void updateCustomURLMapping() throws JsonParseException, JsonMappingException, IOException {
//        HttpEntity<CustomURLMapper> entity = new HttpEntity<CustomURLMapper>(
//                getCustomURLMapperList(IntegrationTestingConstants.CUSTOM_URL_MAPPER_REQUEST_BODY_LIST).get(0), headers);
//
//
//        ResponseEntity<String> response = restTemplate.exchange(
//                createURLWithPort(portalBaseURL + IntegrationTestingConstants.UPDATE_CREATE_URL_MAPPING_URL),
//                HttpMethod.PUT, entity, String.class);
//
//        assertEquals(42L,getCustomURLMapperObject(new Gson().toJson(CommonHelperFunctions.getHashMapFromJsonString(response.getBody()).get("data"))).getId());
//    }
//
//    @Test
//    public void claimCase() throws JsonParseException, JsonMappingException, IOException {
//        HttpEntity<ClaimUnclaimInput> entity = new HttpEntity<ClaimUnclaimInput>(getClaimUnclaimInputObject(
//                IntegrationTestingConstants.CLAIM_UN_CLAIM_REQUEST_BODY) ,headers);
//
//
//        ResponseEntity<String> response = restTemplate.exchange(
//                createURLWithPort(portalBaseURL + IntegrationTestingConstants.CLAIM_CASE_URL),
//                HttpMethod.POST, entity, String.class);
//
//        JSONAssert.assertEquals(IntegrationTestingConstants.CLAIM_CASE_API_RESPONSE_BODY, response.getBody(), false);
//    }
//
//    @Test
//    public void unnclaimCase() throws JsonParseException, JsonMappingException, IOException {
//        HttpEntity<ClaimUnclaimInput> entity = new HttpEntity<ClaimUnclaimInput>(getClaimUnclaimInputObject(
//                IntegrationTestingConstants.UNCLAIM_UN_CLAIM_REQUEST_BODY) ,headers);
//
//
//        ResponseEntity<String> response = restTemplate.exchange(
//                createURLWithPort(portalBaseURL + IntegrationTestingConstants.UNCLAIM_CASE_URL),
//                HttpMethod.POST, entity, String.class);
//
//        JSONAssert.assertEquals(IntegrationTestingConstants.UNCLAIM_CASE_API_RESPONSE_BODY, response.getBody(), false);
//    }
//
//    @Test
//    public void reassign() throws JsonParseException, JsonMappingException, IOException {
//        HttpEntity<ClaimUnclaimInput> entity = new HttpEntity<ClaimUnclaimInput>(getClaimUnclaimInputObject(
//                IntegrationTestingConstants.CLAIM_UN_CLAIM_REQUEST_BODY) ,headers);
//
//
//        ResponseEntity<String> response = restTemplate.exchange(
//                createURLWithPort(portalBaseURL + IntegrationTestingConstants.REASSIGN_URL),
//                HttpMethod.POST, entity, String.class);
//
//        JSONAssert.assertEquals(IntegrationTestingConstants.REASSIGN_RESPONSE, response.getBody(), false);
//    }
//
//    @Test
//    public void setTabKeyComment() throws JsonParseException, JsonMappingException, IOException {
//        HttpEntity<PortalCommentHistory> entity = new HttpEntity<PortalCommentHistory>(
//                getPortalCommentHistoryObject(IntegrationTestingConstants.SET_TAB_COMMENT_REQUEST_BODY),headers);
//
//
//        ResponseEntity<String> response = restTemplate.exchange(
//                createURLWithPort(portalBaseURL + IntegrationTestingConstants.SET_TAB_COMMENT_URL),
//                HttpMethod.POST, entity, String.class);
//
//        assertEquals("personalDetail", getPortalCommentHistoryObject(new Gson().toJson(
//                CommonHelperFunctions.getHashMapFromJsonString(response.getBody()).get("data"))).getTaskKey());
//    }
//
//    @Test
//    public void deleteProduct() {
//        HttpEntity<String> entity = new HttpEntity<String>(null,headers);
//
//
//        ResponseEntity<String> response = restTemplate.exchange(
//                createURLWithPort(portalBaseURL + IntegrationTestingConstants.DELETE_PRODUCT_URL),
//                HttpMethod.DELETE, entity, String.class);
//
//        JSONAssert.assertEquals(IntegrationTestingConstants.DELETE_PRODUCT_RESPONSE, response.getBody(), false);
//    }
//
//    @Test
//    public void deleteCustomURLMapper() {
//        HttpEntity<String> entity = new HttpEntity<String>(null,headers);
//
//
//        ResponseEntity<String> response = restTemplate.exchange(
//                createURLWithPort(portalBaseURL + IntegrationTestingConstants.DELETE_CUSTOM_URL_MAPPING_URL),
//                HttpMethod.DELETE, entity, String.class);
//
//        JSONAssert.assertEquals(IntegrationTestingConstants.DELETE_CUSTOM_URL_MAPPER_RESPONSE, response.getBody(), false);
//    }
//
//    @Test
//    public void exportCustomActionConfiguration() {
//        HttpEntity<String> entity = new HttpEntity<String>(null,headers);
//
//
//        ResponseEntity<String> response = restTemplate.exchange(
//                createURLWithPort(portalBaseURL + IntegrationTestingConstants.EXPORT_CUSTOM_ACTION_CONFIGURATION_URL),
//                HttpMethod.GET, entity, String.class);
//
//        JSONAssert.assertEquals(IntegrationTestingConstants.EXPORT_CUSTOM_ACTION_CONFIGURATION_RESPONSE, response.getBody(), false);
//    }
//
//// @Test
//// public void importCustomActionConfiguration() throws IOException {
//// MultipartFile multipartFile = new MockMultipartFile("custom_url_mapper.xlsx", new FileInputStream(new ClassPathResource(
////      "import_custom_url_mapper.xlsx").getFile()));
//// HttpEntity<MultipartFile> entity = new HttpEntity<MultipartFile>(multipartFile,headers);
////// byte[] bytes ((UploadedMultipartFile) multipartRequest.getFirst("file")).getBytes();
//// ResponseEntity<String> response = restTemplate.exchange(
//// createURLWithPort(portalBaseURL + IntegrationTestingConstants.IMPORT_CUSTOM_ACTION_CONFIGURATION_URL),
//// HttpMethod.POST, entity, String.class);
////
//// JSONAssert.assertEquals(IntegrationTestingConstants.IMPORT_CUSTOM_ACTION_CONFIGURATION_RESPONSE, response.getBody(), false);
//// }
//
}
