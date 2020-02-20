package com.WebApp4;

public class IntegrationTestingConstants {

    public static final String BEARER_TOKEN = "Bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJBNVFJLUVsYmFGV1d1YXZleGpFVEtFRUROQ2JvM2hkUVREYm9iSFlndldNIn0.eyJqdGkiOiJlNjY0NTdlZC01MzE1LTQ4OTktYjQ5ZC00MDk0NTA3NmRiNjYiLCJleHAiOjE1ODI4MDcwOTUsIm5iZiI6MCwiaWF0IjoxNTgxNDg5NDk1LCJpc3MiOiJodHRwOi8vMzUuMjAwLjE4OC4xMjE6ODAwNS9hdXRoL3JlYWxtcy9rdWxpemFfY2UiLCJhdWQiOiJsZW5kaW5nIiwic3ViIjoiYmM0ZjYyMmUtMGExNi00YzY4LWJmNjQtZDE1MjgxZjViMWFlIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoibGVuZGluZyIsImF1dGhfdGltZSI6MCwic2Vzc2lvbl9zdGF0ZSI6ImJmODZkMmE2LWFkOWEtNGZlNC04ODZhLTFlZGJiMjM0MWM4YSIsImFjciI6IjEiLCJhbGxvd2VkLW9yaWdpbnMiOlsiKiJdLCJyZWFsbV9hY2Nlc3MiOnsicm9sZXMiOlsiY21tbkNyZWRpdEFuYWx5c3RQT0NTVUIxIiwiQ21tbkJNUE9DIiwiY29sbGVjdGlvbnNfYWRtaW4iLCJjbW1uQ3JlZGl0QW5hbHlzdFBPQ0FkbWluIiwidW1hX2F1dGhvcml6YXRpb24iXX0sInJlc291cmNlX2FjY2VzcyI6eyJsZW5kaW5nIjp7InJvbGVzIjpbImNtbW5DcmVkaXRBbmFseXN0IiwidXNlciIsIkJ1c2luZXNzIl19LCJhY2NvdW50Ijp7InJvbGVzIjpbIm1hbmFnZS1hY2NvdW50IiwibWFuYWdlLWFjY291bnQtbGlua3MiLCJ2aWV3LXByb2ZpbGUiXX19LCJyb2xlcyI6WyJ1bWFfYXV0aG9yaXphdGlvbiIsIm9mZmxpbmVfYWNjZXNzIiwiY21tbkNyZWRpdEFuYWx5c3RQT0NBZG1pbiIsImNvbGxlY3Rpb25zX2FkbWluIiwiQ21tbkJNUE9DIiwiY21tbkNyZWRpdEFuYWx5c3RQT0NTVUIxIl0sIm5hbWUiOiJjbW1uIHVzZXIiLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJjbW1udXNlciIsImdpdmVuX25hbWUiOiJjbW1uIiwiZmFtaWx5X25hbWUiOiJ1c2VyIiwiZW1haWwiOiJjbW1udXNlckBrdWxpemEuY29tIn0.PqYdPxzpK2UycmemyWU3l2trj4d6nFsFxi4RLGvNSW1rJr4eZiGrvDFLdq_NyFByEevPswYShbOt5BsWhXOwYiQyaBRNgvB5fc7Hh9WWo4-0NJjDQuLYi_BzAw4x_Fa9gvbdM4CAc0C6jetdp_XvtPoo0cK9Va_sptOUvSKuUReWHJ2KoF1H0LxQXYos2DbzMDVh5REh8miyw53F6zmDvPg0WJKOAb9e72fNROZqXy-0lcfHNZHk1NQnRM0q9GwvFh5AyuRrerdeMT7ZKIptGyG7si2ZG388h6pJZc2oPrcezWW5gu5E6cm8YH85eQk8dIi0JwkC2saAw9SWj4EP-g";

    public static final String PORTAL_BASE_URL = "/lending/portal";
    public static final String CMMN_BASE_URL = "/lending/case";
    public static final String DEMO_URL = "http://localhost:8080/topics";
    public static final String GET_COMMENT_URL = "/ced8d1ee-f4b3-11e9-8129-04ea56aaf7a8/comment";
    public static final String DEMO_RESPONSE = "[\n" +
            "  {\n" +
            "    \"id\": \"one\",\n" +
            "    \"name\": \"one\",\n" +
            "    \"description\": \"one\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"three\",\n" +
            "    \"name\": \"three\",\n" +
            "    \"description\": \"three\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"two\",\n" +
            "    \"name\": \"two\",\n" +
            "    \"description\": \"two\"\n" +
            "  }\n" +
            "]";
    public static final String GET_COMMENT_RESPONSE = "{\n" +
            "    \"data\": [\n" +
            "        {\n" +
            "            \"commentType\": \"auditActionComment\",\n" +
            "            \"createdTime\": \"11-21-2019 01:41:07\",\n" +
            "            \"id\": 1212,\n" +
            "            \"message\": \"comment working\",\n" +
            "            \"modifiedTime\": \"11-21-2019 01:41:07\",\n" +
            "            \"portalUser\": {\n" +
            "                \"applicationNumber\": \"SUM(B982, 1)\",\n" +
            "                \"caseInstanceId\": \"ced8d1ee-f4b3-11e9-8129-04ea56aaf7a8\",\n" +
            "                \"caseName\": \"KulizaBackofficePortal\",\n" +
            "                \"id\": 1897,\n" +
            "                \"portalType\": \"BACKOFFICE\"\n" +
            "            },\n" +
            "            \"roleName\": \"cmmnCreditAnalystPOCAdmin\",\n" +
            "            \"taskKey\": \"personalDetail\",\n" +
            "            \"userId\": \"cmmnuser@kuliza.com\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"commentType\": \"auditActionComment\",\n" +
            "            \"createdTime\": \"01-07-2020 04:29:10\",\n" +
            "            \"id\": 2060,\n" +
            "            \"message\": \"\",\n" +
            "            \"modifiedTime\": \"01-07-2020 04:29:10\",\n" +
            "            \"portalUser\": {\n" +
            "                \"applicationNumber\": \"SUM(B982, 1)\",\n" +
            "                \"caseInstanceId\": \"ced8d1ee-f4b3-11e9-8129-04ea56aaf7a8\",\n" +
            "                \"caseName\": \"KulizaBackofficePortal\",\n" +
            "                \"id\": 1897,\n" +
            "                \"portalType\": \"BACKOFFICE\"\n" +
            "            },\n" +
            "            \"roleName\": \"cmmnCreditAnalystPOCAdmin\",\n" +
            "            \"taskKey\": \"other\",\n" +
            "            \"userId\": \"cmmnuser@kuliza.com\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"commentType\": \"auditActionComment\",\n" +
            "            \"createdTime\": \"01-07-2020 04:29:10\",\n" +
            "            \"id\": 2061,\n" +
            "            \"message\": \"\",\n" +
            "            \"modifiedTime\": \"01-07-2020 04:29:10\",\n" +
            "            \"portalUser\": {\n" +
            "                \"applicationNumber\": \"SUM(B982, 1)\",\n" +
            "                \"caseInstanceId\": \"ced8d1ee-f4b3-11e9-8129-04ea56aaf7a8\",\n" +
            "                \"caseName\": \"KulizaBackofficePortal\",\n" +
            "                \"id\": 1897,\n" +
            "                \"portalType\": \"BACKOFFICE\"\n" +
            "            },\n" +
            "            \"roleName\": \"cmmnCreditAnalystPOCAdmin\",\n" +
            "            \"taskKey\": \"other\",\n" +
            "            \"userId\": \"cmmnuser@kuliza.com\"\n" +
            "        }\n" +
            "    ],\n" +
            "    \"message\": \"SUCCESS!\",\n" +
            "    \"status\": 200\n" +
            "}";

    public static final String GET_TAB_CONFIG_URL = "/ced8d1ee-f4b3-11e9-8129-04ea56aaf7a8/get-tab-config/?assignee=cmmnuser@kuliza.com&assignedRoleName=cmmnCreditAnalystPOC";
    public static final String GET_TAB_CONFIG_RESPONSE = "{\n" +
            "    \"data\": [\n" +
            "        {\n" +
            "            \"childPresent\": false,\n" +
            "            \"children\": null,\n" +
            "            \"id\": \"cmmnCreditAnalystPOCSummary\",\n" +
            "            \"label\": \"Summary\",\n" +
            "            \"onLoadId\": \"fireOnLoadSummmary\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"childPresent\": false,\n" +
            "            \"children\": null,\n" +
            "            \"id\": \"personalDetail\",\n" +
            "            \"label\": \"Personal Details\",\n" +
            "            \"onLoadId\": \"\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"childPresent\": true,\n" +
            "            \"children\": [\n" +
            "                {\n" +
            "                    \"childPresent\": false,\n" +
            "                    \"children\": null,\n" +
            "                    \"id\": \"personalAddressDetail\",\n" +
            "                    \"label\": \"Personal\",\n" +
            "                    \"onLoadId\": null\n" +
            "                },\n" +
            "                {\n" +
            "                    \"childPresent\": false,\n" +
            "                    \"children\": null,\n" +
            "                    \"id\": \"professionalAddressDetail\",\n" +
            "                    \"label\": \"Professional\",\n" +
            "                    \"onLoadId\": null\n" +
            "                }\n" +
            "            ],\n" +
            "            \"id\": \"AddressDetails\",\n" +
            "            \"label\": \"Address Details\",\n" +
            "            \"onLoadId\": null\n" +
            "        },\n" +
            "        {\n" +
            "            \"childPresent\": false,\n" +
            "            \"children\": null,\n" +
            "            \"id\": \"application-document\",\n" +
            "            \"label\": \"Documents\",\n" +
            "            \"onLoadId\": null\n" +
            "        },\n" +
            "        {\n" +
            "            \"childPresent\": false,\n" +
            "            \"children\": null,\n" +
            "            \"id\": \"magmaDedupe\",\n" +
            "            \"label\": \"Magma Dedupe\",\n" +
            "            \"onLoadId\": null\n" +
            "        },\n" +
            "        {\n" +
            "            \"childPresent\": false,\n" +
            "            \"children\": null,\n" +
            "            \"id\": \"other\",\n" +
            "            \"label\": \"Other\",\n" +
            "            \"onLoadId\": null\n" +
            "        },\n" +
            "        {\n" +
            "            \"childPresent\": false,\n" +
            "            \"children\": null,\n" +
            "            \"id\": \"test\",\n" +
            "            \"label\": \"Test\",\n" +
            "            \"onLoadId\": null\n" +
            "        }\n" +
            "    ],\n" +
            "    \"message\": \"SUCCESS!\",\n" +
            "    \"status\": 200\n" +
            "}";

    public static final String GET_CARD_CONFIG_URL = "/cmmnCreditAnalystPOCAdmin/pending/ced8d1ee-f4b3-11e9-8129-04ea56aaf7a8/personalDetail/get-card-config?assignee=cmmnuser@kuliza.com";
    // If it's the unique key:value pair in the response, it can be compared as json.
    public static final String GET_CARD_CONFIG_SUB_RESPONSE = "{\n" +
            "  \"errorMessage\": \"\",\n" +
            "    \"message\": \"SUCCESS!\",\n" +
            "    \"screenInfo\": \"personalDetail\",\n" +
            "    \"screenName\": \"Personal Details\",\n" +
            "    \"status\": 200\n" +
            "}";

    public static final String GET_PRODUCT_CONFIG_URL = "/get-product-config/cmmnCreditAnalystPOCAdmin";
    public static final String USER_ID = "cmmnuser@kuliza.com"; // It's response is too large, that's why only this value has been compared.
    public static final String GET_CONFIGURE_PORTAL_URL = "/configurator/cmmnCreditAnalystPOCAdmin/kulizaPersonalLoan1";
    public static final String GET_CONFIGURE_PORTAL_RESPONSE = "{\n" +
            "    \"data\": {\n" +
            "        \"bucketList\": [\n" +
            "            {\n" +
            "                \"bucketActions\": [\n" +
            "                    {\n" +
            "                        \"iconKey\": \"\",\n" +
            "                        \"id\": \"claimBulk\",\n" +
            "                        \"label\": \"Claim\",\n" +
            "                        \"params\": {\n" +
            "                            \"meta\": {\n" +
            "                                \"default\": \"\",\n" +
            "                                \"disabled\": false,\n" +
            "                                \"bulkAction\": true,\n" +
            "                                \"form_type\": \"button\",\n" +
            "                                \"placeholder\": \"\",\n" +
            "                                \"type\": \"action\",\n" +
            "                                \"restApi\": {\n" +
            "                                    \"mapping\": {},\n" +
            "                                    \"subUrl\": \"/lending/portal/fire-bulk-action/-4\",\n" +
            "                                    \"method\": \"POST\",\n" +
            "                                    \"queryParams\": [\n" +
            "                                        \"roleName\",\n" +
            "                                        \"tabKey\",\n" +
            "                                        \"caseInstanceId\"\n" +
            "                                    ],\n" +
            "                                    \"successActions\": [\n" +
            "                                        {\n" +
            "                                            \"formType\": \"toastr\",\n" +
            "                                            \"type\": \"message\",\n" +
            "                                            \"content\": \"Action Successfully triggered\"\n" +
            "                                        },\n" +
            "                                        {\n" +
            "                                            \"page\": \"SELF\",\n" +
            "                                            \"type\": \"route\"\n" +
            "                                        }\n" +
            "                                    ],\n" +
            "                                    \"requestPayload\": {\n" +
            "                                        \"pathVariables\": {},\n" +
            "                                        \"requestBody\": {\n" +
            "                                            \"newAssignee\": \"\",\n" +
            "                                            \"bucketKey\": \"pending\",\n" +
            "                                            \"caseInstanceId\": \"caseInstanceId\",\n" +
            "                                            \"roleName\": \"cmmnCreditAnalystPOCAdmin\"\n" +
            "                                        },\n" +
            "                                        \"requestParams\": {\n" +
            "                                            \"caseInstanceId\": \"caseInstanceId\"\n" +
            "                                        }\n" +
            "                                    },\n" +
            "                                    \"errorActions\": [\n" +
            "                                        {\n" +
            "                                            \"formType\": \"toastr\",\n" +
            "                                            \"type\": \"message\",\n" +
            "                                            \"content\": \"Something went wrong\"\n" +
            "                                        }\n" +
            "                                    ]\n" +
            "                                },\n" +
            "                                \"required\": false\n" +
            "                            },\n" +
            "                            \"iconKey\": \"USER\",\n" +
            "                            \"value\": false\n" +
            "                        },\n" +
            "                        \"value\": false\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"comment\": 0,\n" +
            "                \"editable\": false,\n" +
            "                \"id\": \"claim\",\n" +
            "                \"label\": \"CLAIM\",\n" +
            "                \"onLoadId\": \"\",\n" +
            "                \"redirectToDetails\": false,\n" +
            "                \"variables\": [\n" +
            "                    {\n" +
            "                        \"actionConfigurationList\": [],\n" +
            "                        \"id\": \"firstName\",\n" +
            "                        \"label\": \"First Name\",\n" +
            "                        \"type\": \"String\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"actionConfigurationList\": [],\n" +
            "                        \"id\": \"applicantMobileNumber\",\n" +
            "                        \"label\": \"Contact\",\n" +
            "                        \"type\": \"Number\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"actionConfigurationList\": [\n" +
            "                            {\n" +
            "                                \"iconKey\": \"\",\n" +
            "                                \"id\": \"claim\",\n" +
            "                                \"label\": \"Claim\",\n" +
            "                                \"params\": {\n" +
            "                                    \"meta\": {\n" +
            "                                        \"default\": \"\",\n" +
            "                                        \"disabled\": false,\n" +
            "                                        \"bulkAction\": true,\n" +
            "                                        \"form_type\": \"button\",\n" +
            "                                        \"placeholder\": \"\",\n" +
            "                                        \"type\": \"action\",\n" +
            "                                        \"restApi\": {\n" +
            "                                            \"mapping\": {},\n" +
            "                                            \"subUrl\": \"/lending/portal/fire-custom-action/-4\",\n" +
            "                                            \"method\": \"POST\",\n" +
            "                                            \"queryParams\": [\n" +
            "                                                \"roleName\",\n" +
            "                                                \"tabKey\",\n" +
            "                                                \"caseInstanceId\"\n" +
            "                                            ],\n" +
            "                                            \"successActions\": [\n" +
            "                                                {\n" +
            "                                                    \"formType\": \"toastr\",\n" +
            "                                                    \"type\": \"message\",\n" +
            "                                                    \"content\": \"Action Successfully triggered\"\n" +
            "                                                },\n" +
            "                                                {\n" +
            "                                                    \"page\": \"SELF\",\n" +
            "                                                    \"type\": \"route\"\n" +
            "                                                }\n" +
            "                                            ],\n" +
            "                                            \"requestPayload\": {\n" +
            "                                                \"pathVariables\": {},\n" +
            "                                                \"requestBody\": {\n" +
            "                                                    \"newAssignee\": \"\",\n" +
            "                                                    \"bucketKey\": \"pending\",\n" +
            "                                                    \"caseInstanceId\": \"caseInstanceId\",\n" +
            "                                                    \"roleName\": \"cmmnCreditAnalystPOCAdmin\"\n" +
            "                                                },\n" +
            "                                                \"requestParams\": {\n" +
            "                                                    \"caseInstanceId\": \"caseInstanceId\"\n" +
            "                                                }\n" +
            "                                            },\n" +
            "                                            \"errorActions\": [\n" +
            "                                                {\n" +
            "                                                    \"formType\": \"toastr\",\n" +
            "                                                    \"type\": \"message\",\n" +
            "                                                    \"content\": \"Something went wrong\"\n" +
            "                                                }\n" +
            "                                            ]\n" +
            "                                        },\n" +
            "                                        \"required\": false\n" +
            "                                    },\n" +
            "                                    \"iconKey\": \"ASSIGN\",\n" +
            "                                    \"value\": false\n" +
            "                                },\n" +
            "                                \"value\": false\n" +
            "                            }\n" +
            "                        ],\n" +
            "                        \"id\": \"action\",\n" +
            "                        \"label\": \"Action\",\n" +
            "                        \"type\": \"listOfAction\"\n" +
            "                    }\n" +
            "                ]\n" +
            "            },\n" +
            "            {\n" +
            "                \"bucketActions\": [\n" +
            "                    {\n" +
            "                        \"iconKey\": \"\",\n" +
            "                        \"id\": \"assignBulkCA\",\n" +
            "                        \"label\": \"Assign\",\n" +
            "                        \"params\": {\n" +
            "                            \"meta\": {\n" +
            "                                \"default\": \"\",\n" +
            "                                \"disabled\": false,\n" +
            "                                \"bulkAction\": true,\n" +
            "                                \"form_type\": \"rest-droplist\",\n" +
            "                                \"placeholder\": \"\",\n" +
            "                                \"api\": {\n" +
            "                                    \"options-mapping\": {\n" +
            "                                        \"assignBulkCA\": \"category\"\n" +
            "                                    },\n" +
            "                                    \"subUrl\": \"/lending/fire-custom-action/12\",\n" +
            "                                    \"method\": \"POST\",\n" +
            "                                    \"queryParams\": [\n" +
            "                                        \"roleName\",\n" +
            "                                        \"tabKey\",\n" +
            "                                        \"caseInstanceId\"\n" +
            "                                    ],\n" +
            "                                    \"requestPayload\": {\n" +
            "                                        \"pathVariables\": {},\n" +
            "                                        \"requestBody\": {},\n" +
            "                                        \"requestParams\": {}\n" +
            "                                    },\n" +
            "                                    \"valueType\": \"list\",\n" +
            "                                    \"dependentFields\": {},\n" +
            "                                    \"valuePath\": \"data.response.category\"\n" +
            "                                },\n" +
            "                                \"type\": \"action\",\n" +
            "                                \"restApi\": {\n" +
            "                                    \"mapping\": {},\n" +
            "                                    \"subUrl\": \"/lending/portal/fire-bulk-action/-6\",\n" +
            "                                    \"method\": \"POST\",\n" +
            "                                    \"queryParams\": [\n" +
            "                                        \"roleName\",\n" +
            "                                        \"tabKey\",\n" +
            "                                        \"caseInstanceId\"\n" +
            "                                    ],\n" +
            "                                    \"successActions\": [\n" +
            "                                        {\n" +
            "                                            \"formType\": \"toastr\",\n" +
            "                                            \"type\": \"message\",\n" +
            "                                            \"content\": \"Action Successfully triggered\"\n" +
            "                                        },\n" +
            "                                        {\n" +
            "                                            \"page\": \"SELF\",\n" +
            "                                            \"type\": \"route\"\n" +
            "                                        }\n" +
            "                                    ],\n" +
            "                                    \"requestPayload\": {\n" +
            "                                        \"pathVariables\": {},\n" +
            "                                        \"requestBody\": {\n" +
            "                                            \"newAssignee\": \"assignBulkCA\",\n" +
            "                                            \"caseInstanceId\": \"caseInstanceId\",\n" +
            "                                            \"roleName\": \"cmmnCreditAnalystPOC\",\n" +
            "                                            \"currentAssignee\": \"cmmnuser@kuliza.com\"\n" +
            "                                        },\n" +
            "                                        \"requestParams\": {\n" +
            "                                            \"caseInstanceId\": \"caseInstanceId\"\n" +
            "                                        }\n" +
            "                                    },\n" +
            "                                    \"errorActions\": [\n" +
            "                                        {\n" +
            "                                            \"formType\": \"toastr\",\n" +
            "                                            \"type\": \"message\",\n" +
            "                                            \"content\": \"Something went wrong\"\n" +
            "                                        }\n" +
            "                                    ]\n" +
            "                                },\n" +
            "                                \"required\": false\n" +
            "                            },\n" +
            "                            \"iconKey\": \"\",\n" +
            "                            \"value\": false\n" +
            "                        },\n" +
            "                        \"value\": false\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"iconKey\": \"ADD\",\n" +
            "                        \"id\": \"add\",\n" +
            "                        \"label\": \"Add\",\n" +
            "                        \"params\": {\n" +
            "                            \"meta\": {}\n" +
            "                        },\n" +
            "                        \"value\": false\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"comment\": 2,\n" +
            "                \"editable\": true,\n" +
            "                \"id\": \"pending\",\n" +
            "                \"label\": \"PENDING\",\n" +
            "                \"onLoadId\": \"\",\n" +
            "                \"redirectToDetails\": true,\n" +
            "                \"variables\": [\n" +
            "                    {\n" +
            "                        \"actionConfigurationList\": [],\n" +
            "                        \"id\": \"firstName\",\n" +
            "                        \"label\": \"First Name\",\n" +
            "                        \"type\": \"String\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"actionConfigurationList\": [],\n" +
            "                        \"id\": \"applicantMobileNumber\",\n" +
            "                        \"label\": \"Contact\",\n" +
            "                        \"type\": \"Number\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"actionConfigurationList\": [],\n" +
            "                        \"id\": \"pinCodeHome\",\n" +
            "                        \"label\": \"Pincode\",\n" +
            "                        \"type\": \"Number\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"actionConfigurationList\": [\n" +
            "                            {\n" +
            "                                \"iconKey\": \"PLAY-CIRCLE\",\n" +
            "                                \"id\": \"resume\",\n" +
            "                                \"label\": \"Resume\",\n" +
            "                                \"params\": {\n" +
            "                                    \"meta\": {\n" +
            "                                        \"journeyName\": \"kulizaPersonalLoan1\",\n" +
            "                                        \"commentRequired\": false,\n" +
            "                                        \"form_type\": \"button\",\n" +
            "                                        \"type\": \"action\",\n" +
            "                                        \"required\": false,\n" +
            "                                        \"uniqueIdentifier\": \"applicantMobileNumber\",\n" +
            "                                        \"order\": 9\n" +
            "                                    }\n" +
            "                                },\n" +
            "                                \"value\": false\n" +
            "                            },\n" +
            "                            {\n" +
            "                                \"iconKey\": \"CHECK-CIRCLE\",\n" +
            "                                \"id\": \"assignPendingCA\",\n" +
            "                                \"label\": \"Assign\",\n" +
            "                                \"params\": {\n" +
            "                                    \"meta\": {\n" +
            "                                        \"default\": \"\",\n" +
            "                                        \"disabled\": false,\n" +
            "                                        \"form_type\": \"rest-droplist\",\n" +
            "                                        \"placeholder\": \"\",\n" +
            "                                        \"api\": {\n" +
            "                                            \"options-mapping\": {\n" +
            "                                                \"assignPendingCA\": \"category\"\n" +
            "                                            },\n" +
            "                                            \"subUrl\": \"/lending/fire-custom-action/12\",\n" +
            "                                            \"method\": \"POST\",\n" +
            "                                            \"queryParams\": [\n" +
            "                                                \"roleName\",\n" +
            "                                                \"caseInstanceId\",\n" +
            "                                                \"tabKey\"\n" +
            "                                            ],\n" +
            "                                            \"requestPayload\": {\n" +
            "                                                \"pathVariables\": {},\n" +
            "                                                \"requestBody\": {},\n" +
            "                                                \"requestParams\": {}\n" +
            "                                            },\n" +
            "                                            \"valueType\": \"list\",\n" +
            "                                            \"dependentFields\": {},\n" +
            "                                            \"valuePath\": \"data.response.category\"\n" +
            "                                        },\n" +
            "                                        \"type\": \"action\",\n" +
            "                                        \"restApi\": {\n" +
            "                                            \"mapping\": {},\n" +
            "                                            \"subUrl\": \"/lending/portal/fire-custom-action/-6\",\n" +
            "                                            \"method\": \"POST\",\n" +
            "                                            \"queryParams\": [\n" +
            "                                                \"roleName\",\n" +
            "                                                \"caseInstanceId\",\n" +
            "                                                \"tabKey\"\n" +
            "                                            ],\n" +
            "                                            \"successActions\": [\n" +
            "                                                {\n" +
            "                                                    \"formType\": \"toastr\",\n" +
            "                                                    \"type\": \"message\",\n" +
            "                                                    \"content\": \"Action Successfully triggered\"\n" +
            "                                                },\n" +
            "                                                {\n" +
            "                                                    \"mapping\": {\n" +
            "                                                        \"Status\": \"Done\",\n" +
            "                                                        \"Test\": \"true\"\n" +
            "                                                    },\n" +
            "                                                    \"type\": \"partialSave\"\n" +
            "                                                },\n" +
            "                                                {\n" +
            "                                                    \"page\": \"SELF\",\n" +
            "                                                    \"type\": \"route\"\n" +
            "                                                }\n" +
            "                                            ],\n" +
            "                                            \"requestPayload\": {\n" +
            "                                                \"pathVariables\": {},\n" +
            "                                                \"requestBody\": {\n" +
            "                                                    \"newAssignee\": \"assignPendingCA\",\n" +
            "                                                    \"caseInstanceId\": \"caseInstanceId\",\n" +
            "                                                    \"roleName\": \"cmmnCreditAnalystPOC\",\n" +
            "                                                    \"currentAssignee\": \"cmmnuser@kuliza.com\"\n" +
            "                                                },\n" +
            "                                                \"requestParams\": {\n" +
            "                                                    \"caseInstanceId\": \"caseInstanceId\"\n" +
            "                                                }\n" +
            "                                            },\n" +
            "                                            \"errorActions\": [\n" +
            "                                                {\n" +
            "                                                    \"formType\": \"toastr\",\n" +
            "                                                    \"type\": \"message\",\n" +
            "                                                    \"content\": \"Something went wrong\"\n" +
            "                                                }\n" +
            "                                            ]\n" +
            "                                        },\n" +
            "                                        \"required\": false\n" +
            "                                    }\n" +
            "                                },\n" +
            "                                \"value\": false\n" +
            "                            },\n" +
            "                            {\n" +
            "                                \"iconKey\": \"EDIT\",\n" +
            "                                \"id\": \"edit\",\n" +
            "                                \"label\": \"Edit\",\n" +
            "                                \"params\": {\n" +
            "                                    \"meta\": {}\n" +
            "                                },\n" +
            "                                \"value\": false\n" +
            "                            }\n" +
            "                        ],\n" +
            "                        \"id\": \"action\",\n" +
            "                        \"label\": \"Action\",\n" +
            "                        \"type\": \"listOfAction\"\n" +
            "                    }\n" +
            "                ]\n" +
            "            },\n" +
            "            {\n" +
            "                \"bucketActions\": [\n" +
            "                    {\n" +
            "                        \"iconKey\": \"\",\n" +
            "                        \"id\": \"assignBulkCA\",\n" +
            "                        \"label\": \"Assign\",\n" +
            "                        \"params\": {\n" +
            "                            \"meta\": {\n" +
            "                                \"default\": \"\",\n" +
            "                                \"disabled\": false,\n" +
            "                                \"bulkAction\": true,\n" +
            "                                \"form_type\": \"rest-droplist\",\n" +
            "                                \"placeholder\": \"\",\n" +
            "                                \"api\": {\n" +
            "                                    \"options-mapping\": {\n" +
            "                                        \"assignBulkCA\": \"category\"\n" +
            "                                    },\n" +
            "                                    \"subUrl\": \"/lending/fire-custom-action/12\",\n" +
            "                                    \"method\": \"POST\",\n" +
            "                                    \"queryParams\": [\n" +
            "                                        \"roleName\",\n" +
            "                                        \"tabKey\",\n" +
            "                                        \"caseInstanceId\"\n" +
            "                                    ],\n" +
            "                                    \"requestPayload\": {\n" +
            "                                        \"pathVariables\": {},\n" +
            "                                        \"requestBody\": {},\n" +
            "                                        \"requestParams\": {}\n" +
            "                                    },\n" +
            "                                    \"valueType\": \"list\",\n" +
            "                                    \"dependentFields\": {},\n" +
            "                                    \"valuePath\": \"data.response.category\"\n" +
            "                                },\n" +
            "                                \"type\": \"action\",\n" +
            "                                \"restApi\": {\n" +
            "                                    \"mapping\": {},\n" +
            "                                    \"subUrl\": \"/lending/portal/fire-bulk-action/-6\",\n" +
            "                                    \"method\": \"POST\",\n" +
            "                                    \"queryParams\": [\n" +
            "                                        \"roleName\",\n" +
            "                                        \"tabKey\",\n" +
            "                                        \"caseInstanceId\"\n" +
            "                                    ],\n" +
            "                                    \"successActions\": [\n" +
            "                                        {\n" +
            "                                            \"formType\": \"toastr\",\n" +
            "                                            \"type\": \"message\",\n" +
            "                                            \"content\": \"Action Successfully triggered\"\n" +
            "                                        },\n" +
            "                                        {\n" +
            "                                            \"page\": \"SELF\",\n" +
            "                                            \"type\": \"route\"\n" +
            "                                        }\n" +
            "                                    ],\n" +
            "                                    \"requestPayload\": {\n" +
            "                                        \"pathVariables\": {},\n" +
            "                                        \"requestBody\": {\n" +
            "                                            \"newAssignee\": \"assignBulkCA\",\n" +
            "                                            \"caseInstanceId\": \"caseInstanceId\",\n" +
            "                                            \"roleName\": \"cmmnCreditAnalystPOC\",\n" +
            "                                            \"currentAssignee\": \"cmmnuser@kuliza.com\"\n" +
            "                                        },\n" +
            "                                        \"requestParams\": {\n" +
            "                                            \"caseInstanceId\": \"caseInstanceId\"\n" +
            "                                        }\n" +
            "                                    },\n" +
            "                                    \"errorActions\": [\n" +
            "                                        {\n" +
            "                                            \"formType\": \"toastr\",\n" +
            "                                            \"type\": \"message\",\n" +
            "                                            \"content\": \"Something went wrong\"\n" +
            "                                        }\n" +
            "                                    ]\n" +
            "                                },\n" +
            "                                \"required\": false\n" +
            "                            },\n" +
            "                            \"iconKey\": \"\",\n" +
            "                            \"value\": false\n" +
            "                        },\n" +
            "                        \"value\": false\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"iconKey\": \"ADD\",\n" +
            "                        \"id\": \"add\",\n" +
            "                        \"label\": \"Add\",\n" +
            "                        \"params\": {\n" +
            "                            \"meta\": {}\n" +
            "                        },\n" +
            "                        \"value\": false\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"comment\": 2,\n" +
            "                \"editable\": true,\n" +
            "                \"id\": \"all\",\n" +
            "                \"label\": \"All\",\n" +
            "                \"onLoadId\": \"\",\n" +
            "                \"redirectToDetails\": true,\n" +
            "                \"variables\": [\n" +
            "                    {\n" +
            "                        \"actionConfigurationList\": [],\n" +
            "                        \"id\": \"firstName\",\n" +
            "                        \"label\": \"First Name\",\n" +
            "                        \"type\": \"String\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"actionConfigurationList\": [],\n" +
            "                        \"id\": \"applicantMobileNumber\",\n" +
            "                        \"label\": \"Contact\",\n" +
            "                        \"type\": \"Number\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"actionConfigurationList\": [],\n" +
            "                        \"id\": \"pinCodeHome\",\n" +
            "                        \"label\": \"Pincode\",\n" +
            "                        \"type\": \"Number\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"actionConfigurationList\": [\n" +
            "                            {\n" +
            "                                \"iconKey\": \"PLAY-CIRCLE\",\n" +
            "                                \"id\": \"resume\",\n" +
            "                                \"label\": \"Resume\",\n" +
            "                                \"params\": {\n" +
            "                                    \"meta\": {\n" +
            "                                        \"journeyName\": \"kulizaPersonalLoan1\",\n" +
            "                                        \"commentRequired\": false,\n" +
            "                                        \"form_type\": \"button\",\n" +
            "                                        \"type\": \"action\",\n" +
            "                                        \"required\": false,\n" +
            "                                        \"uniqueIdentifier\": \"applicantMobileNumber\",\n" +
            "                                        \"order\": 9\n" +
            "                                    }\n" +
            "                                },\n" +
            "                                \"value\": false\n" +
            "                            },\n" +
            "                            {\n" +
            "                                \"iconKey\": \"CHECK-CIRCLE\",\n" +
            "                                \"id\": \"assignPendingCA\",\n" +
            "                                \"label\": \"Assign\",\n" +
            "                                \"params\": {\n" +
            "                                    \"meta\": {\n" +
            "                                        \"default\": \"\",\n" +
            "                                        \"disabled\": false,\n" +
            "                                        \"form_type\": \"rest-droplist\",\n" +
            "                                        \"placeholder\": \"\",\n" +
            "                                        \"api\": {\n" +
            "                                            \"options-mapping\": {\n" +
            "                                                \"assignPendingCA\": \"category\"\n" +
            "                                            },\n" +
            "                                            \"subUrl\": \"/lending/fire-custom-action/12\",\n" +
            "                                            \"method\": \"POST\",\n" +
            "                                            \"queryParams\": [\n" +
            "                                                \"roleName\",\n" +
            "                                                \"caseInstanceId\",\n" +
            "                                                \"tabKey\"\n" +
            "                                            ],\n" +
            "                                            \"requestPayload\": {\n" +
            "                                                \"pathVariables\": {},\n" +
            "                                                \"requestBody\": {},\n" +
            "                                                \"requestParams\": {}\n" +
            "                                            },\n" +
            "                                            \"valueType\": \"list\",\n" +
            "                                            \"dependentFields\": {},\n" +
            "                                            \"valuePath\": \"data.response.category\"\n" +
            "                                        },\n" +
            "                                        \"type\": \"action\",\n" +
            "                                        \"restApi\": {\n" +
            "                                            \"mapping\": {},\n" +
            "                                            \"subUrl\": \"/lending/portal/fire-custom-action/-6\",\n" +
            "                                            \"method\": \"POST\",\n" +
            "                                            \"queryParams\": [\n" +
            "                                                \"roleName\",\n" +
            "                                                \"caseInstanceId\",\n" +
            "                                                \"tabKey\"\n" +
            "                                            ],\n" +
            "                                            \"successActions\": [\n" +
            "                                                {\n" +
            "                                                    \"formType\": \"toastr\",\n" +
            "                                                    \"type\": \"message\",\n" +
            "                                                    \"content\": \"Action Successfully triggered\"\n" +
            "                                                },\n" +
            "                                                {\n" +
            "                                                    \"mapping\": {\n" +
            "                                                        \"Status\": \"Done\",\n" +
            "                                                        \"Test\": \"true\"\n" +
            "                                                    },\n" +
            "                                                    \"type\": \"partialSave\"\n" +
            "                                                },\n" +
            "                                                {\n" +
            "                                                    \"page\": \"SELF\",\n" +
            "                                                    \"type\": \"route\"\n" +
            "                                                }\n" +
            "                                            ],\n" +
            "                                            \"requestPayload\": {\n" +
            "                                                \"pathVariables\": {},\n" +
            "                                                \"requestBody\": {\n" +
            "                                                    \"newAssignee\": \"assignPendingCA\",\n" +
            "                                                    \"caseInstanceId\": \"caseInstanceId\",\n" +
            "                                                    \"roleName\": \"cmmnCreditAnalystPOC\",\n" +
            "                                                    \"currentAssignee\": \"cmmnuser@kuliza.com\"\n" +
            "                                                },\n" +
            "                                                \"requestParams\": {\n" +
            "                                                    \"caseInstanceId\": \"caseInstanceId\"\n" +
            "                                                }\n" +
            "                                            },\n" +
            "                                            \"errorActions\": [\n" +
            "                                                {\n" +
            "                                                    \"formType\": \"toastr\",\n" +
            "                                                    \"type\": \"message\",\n" +
            "                                                    \"content\": \"Something went wrong\"\n" +
            "                                                }\n" +
            "                                            ]\n" +
            "                                        },\n" +
            "                                        \"required\": false\n" +
            "                                    }\n" +
            "                                },\n" +
            "                                \"value\": false\n" +
            "                            },\n" +
            "                            {\n" +
            "                                \"iconKey\": \"EDIT\",\n" +
            "                                \"id\": \"edit\",\n" +
            "                                \"label\": \"Edit\",\n" +
            "                                \"params\": {\n" +
            "                                    \"meta\": {}\n" +
            "                                },\n" +
            "                                \"value\": false\n" +
            "                            }\n" +
            "                        ],\n" +
            "                        \"id\": \"action\",\n" +
            "                        \"label\": \"Action\",\n" +
            "                        \"type\": \"listOfAction\"\n" +
            "                    }\n" +
            "                ]\n" +
            "            },\n" +
            "            {\n" +
            "                \"bucketActions\": [\n" +
            "                    {\n" +
            "                        \"iconKey\": \"\",\n" +
            "                        \"id\": \"assignBulkCA\",\n" +
            "                        \"label\": \"Assign\",\n" +
            "                        \"params\": {\n" +
            "                            \"meta\": {\n" +
            "                                \"default\": \"\",\n" +
            "                                \"disabled\": false,\n" +
            "                                \"bulkAction\": true,\n" +
            "                                \"form_type\": \"rest-droplist\",\n" +
            "                                \"placeholder\": \"\",\n" +
            "                                \"api\": {\n" +
            "                                    \"options-mapping\": {\n" +
            "                                        \"assignBulkCA\": \"category\"\n" +
            "                                    },\n" +
            "                                    \"subUrl\": \"/lending/fire-custom-action/12\",\n" +
            "                                    \"method\": \"POST\",\n" +
            "                                    \"queryParams\": [\n" +
            "                                        \"roleName\",\n" +
            "                                        \"tabKey\",\n" +
            "                                        \"caseInstanceId\"\n" +
            "                                    ],\n" +
            "                                    \"requestPayload\": {\n" +
            "                                        \"pathVariables\": {},\n" +
            "                                        \"requestBody\": {},\n" +
            "                                        \"requestParams\": {}\n" +
            "                                    },\n" +
            "                                    \"valueType\": \"list\",\n" +
            "                                    \"dependentFields\": {},\n" +
            "                                    \"valuePath\": \"data.response.category\"\n" +
            "                                },\n" +
            "                                \"type\": \"action\",\n" +
            "                                \"restApi\": {\n" +
            "                                    \"mapping\": {},\n" +
            "                                    \"subUrl\": \"/lending/portal/fire-bulk-action/-6\",\n" +
            "                                    \"method\": \"POST\",\n" +
            "                                    \"queryParams\": [\n" +
            "                                        \"roleName\",\n" +
            "                                        \"tabKey\",\n" +
            "                                        \"caseInstanceId\"\n" +
            "                                    ],\n" +
            "                                    \"successActions\": [\n" +
            "                                        {\n" +
            "                                            \"formType\": \"toastr\",\n" +
            "                                            \"type\": \"message\",\n" +
            "                                            \"content\": \"Action Successfully triggered\"\n" +
            "                                        },\n" +
            "                                        {\n" +
            "                                            \"page\": \"SELF\",\n" +
            "                                            \"type\": \"route\"\n" +
            "                                        }\n" +
            "                                    ],\n" +
            "                                    \"requestPayload\": {\n" +
            "                                        \"pathVariables\": {},\n" +
            "                                        \"requestBody\": {\n" +
            "                                            \"newAssignee\": \"assignBulkCA\",\n" +
            "                                            \"caseInstanceId\": \"caseInstanceId\",\n" +
            "                                            \"roleName\": \"cmmnCreditAnalystPOC\",\n" +
            "                                            \"currentAssignee\": \"cmmnuser@kuliza.com\"\n" +
            "                                        },\n" +
            "                                        \"requestParams\": {\n" +
            "                                            \"caseInstanceId\": \"caseInstanceId\"\n" +
            "                                        }\n" +
            "                                    },\n" +
            "                                    \"errorActions\": [\n" +
            "                                        {\n" +
            "                                            \"formType\": \"toastr\",\n" +
            "                                            \"type\": \"message\",\n" +
            "                                            \"content\": \"Something went wrong\"\n" +
            "                                        }\n" +
            "                                    ]\n" +
            "                                },\n" +
            "                                \"required\": false\n" +
            "                            },\n" +
            "                            \"iconKey\": \"\",\n" +
            "                            \"value\": false\n" +
            "                        },\n" +
            "                        \"value\": false\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"iconKey\": \"ADD\",\n" +
            "                        \"id\": \"add\",\n" +
            "                        \"label\": \"Add\",\n" +
            "                        \"params\": {\n" +
            "                            \"meta\": {}\n" +
            "                        },\n" +
            "                        \"value\": false\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"comment\": 2,\n" +
            "                \"editable\": true,\n" +
            "                \"id\": \"pending-all\",\n" +
            "                \"label\": \"ALL PENDING\",\n" +
            "                \"onLoadId\": \"\",\n" +
            "                \"redirectToDetails\": true,\n" +
            "                \"variables\": [\n" +
            "                    {\n" +
            "                        \"actionConfigurationList\": [],\n" +
            "                        \"id\": \"firstName\",\n" +
            "                        \"label\": \"First Name\",\n" +
            "                        \"type\": \"String\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"actionConfigurationList\": [],\n" +
            "                        \"id\": \"applicantMobileNumber\",\n" +
            "                        \"label\": \"Contact\",\n" +
            "                        \"type\": \"Number\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"actionConfigurationList\": [],\n" +
            "                        \"id\": \"pinCodeHome\",\n" +
            "                        \"label\": \"Pincode\",\n" +
            "                        \"type\": \"Number\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"actionConfigurationList\": [\n" +
            "                            {\n" +
            "                                \"iconKey\": \"PLAY-CIRCLE\",\n" +
            "                                \"id\": \"resume\",\n" +
            "                                \"label\": \"Resume\",\n" +
            "                                \"params\": {\n" +
            "                                    \"meta\": {\n" +
            "                                        \"journeyName\": \"kulizaPersonalLoan1\",\n" +
            "                                        \"commentRequired\": false,\n" +
            "                                        \"form_type\": \"button\",\n" +
            "                                        \"type\": \"action\",\n" +
            "                                        \"required\": false,\n" +
            "                                        \"uniqueIdentifier\": \"applicantMobileNumber\",\n" +
            "                                        \"order\": 9\n" +
            "                                    }\n" +
            "                                },\n" +
            "                                \"value\": false\n" +
            "                            },\n" +
            "                            {\n" +
            "                                \"iconKey\": \"CHECK-CIRCLE\",\n" +
            "                                \"id\": \"assignPendingCA\",\n" +
            "                                \"label\": \"Assign\",\n" +
            "                                \"params\": {\n" +
            "                                    \"meta\": {\n" +
            "                                        \"default\": \"\",\n" +
            "                                        \"disabled\": false,\n" +
            "                                        \"form_type\": \"rest-droplist\",\n" +
            "                                        \"placeholder\": \"\",\n" +
            "                                        \"api\": {\n" +
            "                                            \"options-mapping\": {\n" +
            "                                                \"assignPendingCA\": \"category\"\n" +
            "                                            },\n" +
            "                                            \"subUrl\": \"/lending/fire-custom-action/12\",\n" +
            "                                            \"method\": \"POST\",\n" +
            "                                            \"queryParams\": [\n" +
            "                                                \"roleName\",\n" +
            "                                                \"caseInstanceId\",\n" +
            "                                                \"tabKey\"\n" +
            "                                            ],\n" +
            "                                            \"requestPayload\": {\n" +
            "                                                \"pathVariables\": {},\n" +
            "                                                \"requestBody\": {},\n" +
            "                                                \"requestParams\": {}\n" +
            "                                            },\n" +
            "                                            \"valueType\": \"list\",\n" +
            "                                            \"dependentFields\": {},\n" +
            "                                            \"valuePath\": \"data.response.category\"\n" +
            "                                        },\n" +
            "                                        \"type\": \"action\",\n" +
            "                                        \"restApi\": {\n" +
            "                                            \"mapping\": {},\n" +
            "                                            \"subUrl\": \"/lending/portal/fire-custom-action/-6\",\n" +
            "                                            \"method\": \"POST\",\n" +
            "                                            \"queryParams\": [\n" +
            "                                                \"roleName\",\n" +
            "                                                \"caseInstanceId\",\n" +
            "                                                \"tabKey\"\n" +
            "                                            ],\n" +
            "                                            \"successActions\": [\n" +
            "                                                {\n" +
            "                                                    \"formType\": \"toastr\",\n" +
            "                                                    \"type\": \"message\",\n" +
            "                                                    \"content\": \"Action Successfully triggered\"\n" +
            "                                                },\n" +
            "                                                {\n" +
            "                                                    \"mapping\": {\n" +
            "                                                        \"Status\": \"Done\",\n" +
            "                                                        \"Test\": \"true\"\n" +
            "                                                    },\n" +
            "                                                    \"type\": \"partialSave\"\n" +
            "                                                },\n" +
            "                                                {\n" +
            "                                                    \"page\": \"SELF\",\n" +
            "                                                    \"type\": \"route\"\n" +
            "                                                }\n" +
            "                                            ],\n" +
            "                                            \"requestPayload\": {\n" +
            "                                                \"pathVariables\": {},\n" +
            "                                                \"requestBody\": {\n" +
            "                                                    \"newAssignee\": \"assignPendingCA\",\n" +
            "                                                    \"caseInstanceId\": \"caseInstanceId\",\n" +
            "                                                    \"roleName\": \"cmmnCreditAnalystPOC\",\n" +
            "                                                    \"currentAssignee\": \"cmmnuser@kuliza.com\"\n" +
            "                                                },\n" +
            "                                                \"requestParams\": {\n" +
            "                                                    \"caseInstanceId\": \"caseInstanceId\"\n" +
            "                                                }\n" +
            "                                            },\n" +
            "                                            \"errorActions\": [\n" +
            "                                                {\n" +
            "                                                    \"formType\": \"toastr\",\n" +
            "                                                    \"type\": \"message\",\n" +
            "                                                    \"content\": \"Something went wrong\"\n" +
            "                                                }\n" +
            "                                            ]\n" +
            "                                        },\n" +
            "                                        \"required\": false\n" +
            "                                    }\n" +
            "                                },\n" +
            "                                \"value\": false\n" +
            "                            },\n" +
            "                            {\n" +
            "                                \"iconKey\": \"EDIT\",\n" +
            "                                \"id\": \"edit\",\n" +
            "                                \"label\": \"Edit\",\n" +
            "                                \"params\": {\n" +
            "                                    \"meta\": {}\n" +
            "                                },\n" +
            "                                \"value\": false\n" +
            "                            }\n" +
            "                        ],\n" +
            "                        \"id\": \"action\",\n" +
            "                        \"label\": \"Action\",\n" +
            "                        \"type\": \"listOfAction\"\n" +
            "                    }\n" +
            "                ]\n" +
            "            },\n" +
            "            {\n" +
            "                \"bucketActions\": [\n" +
            "                    {\n" +
            "                        \"iconKey\": \"DELETE\",\n" +
            "                        \"id\": \"delete\",\n" +
            "                        \"label\": \"Delete\",\n" +
            "                        \"params\": {\n" +
            "                            \"meta\": {}\n" +
            "                        },\n" +
            "                        \"value\": false\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"comment\": 1,\n" +
            "                \"editable\": false,\n" +
            "                \"id\": \"history\",\n" +
            "                \"label\": \"HISTORY\",\n" +
            "                \"onLoadId\": \"\",\n" +
            "                \"redirectToDetails\": true,\n" +
            "                \"variables\": [\n" +
            "                    {\n" +
            "                        \"actionConfigurationList\": [],\n" +
            "                        \"id\": \"firstName\",\n" +
            "                        \"label\": \"First Name\",\n" +
            "                        \"type\": \"String\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"actionConfigurationList\": [],\n" +
            "                        \"id\": \"applicantMobileNumber\",\n" +
            "                        \"label\": \"Contact\",\n" +
            "                        \"type\": \"Number\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"actionConfigurationList\": [\n" +
            "                            {\n" +
            "                                \"iconKey\": \"DELETE\",\n" +
            "                                \"id\": \"delete\",\n" +
            "                                \"label\": \"Delete\",\n" +
            "                                \"params\": {\n" +
            "                                    \"meta\": {}\n" +
            "                                },\n" +
            "                                \"value\": false\n" +
            "                            }\n" +
            "                        ],\n" +
            "                        \"id\": \"action\",\n" +
            "                        \"label\": \"Action\",\n" +
            "                        \"type\": \"listOfAction\"\n" +
            "                    }\n" +
            "                ]\n" +
            "            },\n" +
            "            {\n" +
            "                \"bucketActions\": [\n" +
            "                    {\n" +
            "                        \"iconKey\": \"DELETE\",\n" +
            "                        \"id\": \"delete\",\n" +
            "                        \"label\": \"Delete\",\n" +
            "                        \"params\": {\n" +
            "                            \"meta\": {}\n" +
            "                        },\n" +
            "                        \"value\": false\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"comment\": 1,\n" +
            "                \"editable\": false,\n" +
            "                \"id\": \"history-all\",\n" +
            "                \"label\": \"ALL HISTORY\",\n" +
            "                \"onLoadId\": \"\",\n" +
            "                \"redirectToDetails\": true,\n" +
            "                \"variables\": [\n" +
            "                    {\n" +
            "                        \"actionConfigurationList\": [],\n" +
            "                        \"id\": \"firstName\",\n" +
            "                        \"label\": \"First Name\",\n" +
            "                        \"type\": \"String\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"actionConfigurationList\": [],\n" +
            "                        \"id\": \"applicantMobileNumber\",\n" +
            "                        \"label\": \"Contact\",\n" +
            "                        \"type\": \"Number\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"actionConfigurationList\": [\n" +
            "                            {\n" +
            "                                \"iconKey\": \"DELETE\",\n" +
            "                                \"id\": \"delete\",\n" +
            "                                \"label\": \"Delete\",\n" +
            "                                \"params\": {\n" +
            "                                    \"meta\": {}\n" +
            "                                },\n" +
            "                                \"value\": false\n" +
            "                            }\n" +
            "                        ],\n" +
            "                        \"id\": \"action\",\n" +
            "                        \"label\": \"Action\",\n" +
            "                        \"type\": \"listOfAction\"\n" +
            "                    }\n" +
            "                ]\n" +
            "            }\n" +
            "        ],\n" +
            "        \"id\": 63,\n" +
            "        \"productActionList\": [\n" +
            "            {\n" +
            "                \"iconKey\": \"TRIGGER\",\n" +
            "                \"id\": \"triggerkulizaPersonalLoan1\",\n" +
            "                \"label\": \"Personal Loan\",\n" +
            "                \"params\": {\n" +
            "                    \"meta\": {\n" +
            "                        \"journeyName\": \"kulizaPersonalLoan1\",\n" +
            "                        \"default\": \"\",\n" +
            "                        \"initiateParams\": {\n" +
            "                            \"currentRoleName\": \"currentRoleName\",\n" +
            "                            \"currentUserName\": \"currentUserName\"\n" +
            "                        },\n" +
            "                        \"disabled\": false,\n" +
            "                        \"form_type\": \"button\",\n" +
            "                        \"placeholder\": \"\",\n" +
            "                        \"type\": \"triggerJourney\",\n" +
            "                        \"required\": false,\n" +
            "                        \"uniqueIdentifier\": \"applicantMobileNumber\",\n" +
            "                        \"token\": false\n" +
            "                    }\n" +
            "                },\n" +
            "                \"value\": false\n" +
            "            },\n" +
            "            {\n" +
            "                \"iconKey\": \"TRIGGER\",\n" +
            "                \"id\": \"triggerkulizaPersonalLoan2\",\n" +
            "                \"label\": \"Test Journey\",\n" +
            "                \"params\": {\n" +
            "                    \"meta\": {\n" +
            "                        \"journeyName\": \"testJourneyM\",\n" +
            "                        \"default\": \"\",\n" +
            "                        \"disabled\": false,\n" +
            "                        \"form_type\": \"button\",\n" +
            "                        \"placeholder\": \"\",\n" +
            "                        \"type\": \"triggerJourney\",\n" +
            "                        \"required\": false,\n" +
            "                        \"token\": false\n" +
            "                    }\n" +
            "                },\n" +
            "                \"value\": false\n" +
            "            }\n" +
            "        ],\n" +
            "        \"productLabel\": \"Personal Loan 1\",\n" +
            "        \"productType\": \"kulizaPersonalLoan1\",\n" +
            "        \"productVariableList\": null,\n" +
            "        \"roleLabel\": \"CMM Credit Analyst POC Admin\",\n" +
            "        \"roleName\": \"cmmnCreditAnalystPOCAdmin\",\n" +
            "        \"userId\": \"cmmnuser@kuliza.com\"\n" +
            "    },\n" +
            "    \"message\": \"SUCCESS!\",\n" +
            "    \"status\": 200\n" +
            "}";

    public static final String GET_ASSIGNED_CASE_LIST_URL = "/assignedList/cmmnCreditAnalystPOCAdmin/2214e328-6789-43de-9229-3142414d80ef/kulizaPersonalLoan/pending?offset=0&pageWidth=10";
    public static final String GET_ASSIGNED_CASE_LIST_RESPONSE = "{\n" +
            "    \"data\": {\n" +
            "        \"meta\": {\n" +
            "            \"showPagination\": true,\n" +
            "            \"totalCount\": 1\n" +
            "        },\n" +
            "        \"pending\": [\n" +
            "            {\n" +
            "                \"firstName\": \"Meeta\",\n" +
            "                \"assignedRoleName\": \"cmmnCreditAnalystPOC\",\n" +
            "                \"bucketKey\": \"pending\",\n" +
            "                \"created\": \"2019-04-29 19:21:33.047\",\n" +
            "                \"caseInstanceId\": \"3960b03a-6a4b-11e9-970a-42010aa0001b\",\n" +
            "                \"applicantMobileNumber\": \"9877653412\",\n" +
            "                \"roleName\": \"cmmnCreditAnalystPOCAdmin\",\n" +
            "                \"taskName\": \"cmmnCreditAnalystPOC-list\",\n" +
            "                \"assignee\": \"cmmnuser@kuliza.com\",\n" +
            "                \"parentProcessInstanceId\": null\n" +
            "            }\n" +
            "        ]\n" +
            "    },\n" +
            "    \"message\": \"OK\",\n" +
            "    \"status\": 200\n" +
            "}";

    public static final String POST_ADD_PRODUCT_CONFIG_URL = "/configurator/add-product-config";
    public static final String PORTAL_CONFIGURATION_MODEL_JSON_STRING = "{\n" +
            "      \"bucketList\": [\n" +
            "        {\n" +
            "          \"bucketActions\": [\n" +
            "            {\n" +
            "              \"iconKey\": \"\",\n" +
            "              \"id\": \"claimBulk\",\n" +
            "              \"label\": \"Claim\",\n" +
            "              \"params\": {\n" +
            "                \"meta\": {\n" +
            "                  \"default\": \"\",\n" +
            "                  \"disabled\": false,\n" +
            "                  \"bulkAction\": true,\n" +
            "                  \"form_type\": \"button\",\n" +
            "                  \"placeholder\": \"\",\n" +
            "                  \"type\": \"action\",\n" +
            "                  \"restApi\": {\n" +
            "                    \"mapping\": {},\n" +
            "                    \"subUrl\": \"/lending/portal/fire-bulk-action/-4\",\n" +
            "                    \"method\": \"POST\",\n" +
            "                    \"queryParams\": [\n" +
            "                      \"roleName\",\n" +
            "                      \"tabKey\",\n" +
            "                      \"caseInstanceId\"\n" +
            "                    ],\n" +
            "                    \"successActions\": [\n" +
            "                      {\n" +
            "                        \"formType\": \"toastr\",\n" +
            "                        \"type\": \"message\",\n" +
            "                        \"content\": \"Action Successfully triggered\"\n" +
            "                      },\n" +
            "                      {\n" +
            "                        \"page\": \"SELF\",\n" +
            "                        \"type\": \"route\"\n" +
            "                      }\n" +
            "                    ],\n" +
            "                    \"requestPayload\": {\n" +
            "                      \"pathVariables\": {},\n" +
            "                      \"requestBody\": {\n" +
            "                        \"newAssignee\": \"\",\n" +
            "                        \"bucketKey\": \"pending\",\n" +
            "                        \"caseInstanceId\": \"caseInstanceId\",\n" +
            "                        \"roleName\": \"cmmnCreditAnalystPOCAdmin\"\n" +
            "                      },\n" +
            "                      \"requestParams\": {\n" +
            "                        \"caseInstanceId\": \"caseInstanceId\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"errorActions\": [\n" +
            "                      {\n" +
            "                        \"formType\": \"toastr\",\n" +
            "                        \"type\": \"message\",\n" +
            "                        \"content\": \"Something went wrong\"\n" +
            "                      }\n" +
            "                    ]\n" +
            "                  },\n" +
            "                  \"required\": false\n" +
            "                },\n" +
            "                \"iconKey\": \"USER\",\n" +
            "                \"value\": false\n" +
            "              },\n" +
            "              \"value\": false\n" +
            "            }\n" +
            "          ],\n" +
            "          \"comment\": 0,\n" +
            "          \"editable\": false,\n" +
            "          \"id\": \"claim\",\n" +
            "          \"label\": \"CLAIM\",\n" +
            "          \"onLoadId\": \"\",\n" +
            "          \"redirectToDetails\": false,\n" +
            "          \"variables\": [\n" +
            "            {\n" +
            "              \"actionConfigurationList\": [],\n" +
            "              \"id\": \"firstName\",\n" +
            "              \"label\": \"First Name\",\n" +
            "              \"type\": \"String\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"actionConfigurationList\": [],\n" +
            "              \"id\": \"applicantMobileNumber\",\n" +
            "              \"label\": \"Contact\",\n" +
            "              \"type\": \"Number\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"actionConfigurationList\": [\n" +
            "                {\n" +
            "                  \"iconKey\": \"\",\n" +
            "                  \"id\": \"claim\",\n" +
            "                  \"label\": \"Claim\",\n" +
            "                  \"params\": {\n" +
            "                    \"meta\": {\n" +
            "                      \"default\": \"\",\n" +
            "                      \"disabled\": false,\n" +
            "                      \"bulkAction\": true,\n" +
            "                      \"form_type\": \"button\",\n" +
            "                      \"placeholder\": \"\",\n" +
            "                      \"type\": \"action\",\n" +
            "                      \"restApi\": {\n" +
            "                        \"mapping\": {},\n" +
            "                        \"subUrl\": \"/lending/portal/fire-custom-action/-4\",\n" +
            "                        \"method\": \"POST\",\n" +
            "                        \"queryParams\": [\n" +
            "                          \"roleName\",\n" +
            "                          \"tabKey\",\n" +
            "                          \"caseInstanceId\"\n" +
            "                        ],\n" +
            "                        \"successActions\": [\n" +
            "                          {\n" +
            "                            \"formType\": \"toastr\",\n" +
            "                            \"type\": \"message\",\n" +
            "                            \"content\": \"Action Successfully triggered\"\n" +
            "                          },\n" +
            "                          {\n" +
            "                            \"page\": \"SELF\",\n" +
            "                            \"type\": \"route\"\n" +
            "                          }\n" +
            "                        ],\n" +
            "                        \"requestPayload\": {\n" +
            "                          \"pathVariables\": {},\n" +
            "                          \"requestBody\": {\n" +
            "                            \"newAssignee\": \"\",\n" +
            "                            \"bucketKey\": \"pending\",\n" +
            "                            \"caseInstanceId\": \"caseInstanceId\",\n" +
            "                            \"roleName\": \"cmmnCreditAnalystPOCAdmin\"\n" +
            "                          },\n" +
            "                          \"requestParams\": {\n" +
            "                            \"caseInstanceId\": \"caseInstanceId\"\n" +
            "                          }\n" +
            "                        },\n" +
            "                        \"errorActions\": [\n" +
            "                          {\n" +
            "                            \"formType\": \"toastr\",\n" +
            "                            \"type\": \"message\",\n" +
            "                            \"content\": \"Something went wrong\"\n" +
            "                          }\n" +
            "                        ]\n" +
            "                      },\n" +
            "                      \"required\": false\n" +
            "                    },\n" +
            "                    \"iconKey\": \"ASSIGN\",\n" +
            "                    \"value\": false\n" +
            "                  },\n" +
            "                  \"value\": false\n" +
            "                }\n" +
            "              ],\n" +
            "              \"id\": \"action\",\n" +
            "              \"label\": \"Action\",\n" +
            "              \"type\": \"listOfAction\"\n" +
            "            }\n" +
            "          ]\n" +
            "        }\n" +
            "      ],\n" +
            "      \"id\": 7,\n" +
            "      \"productActionList\": [\n" +
            "        {\n" +
            "          \"iconKey\": \"TRIGGER\",\n" +
            "          \"id\": \"triggerkulizaPersonalLoan1\",\n" +
            "          \"label\": \"Personal Loan\",\n" +
            "          \"params\": {\n" +
            "            \"meta\": {\n" +
            "              \"journeyName\": \"kulizaPersonalLoan1\",\n" +
            "              \"default\": \"\",\n" +
            "              \"disabled\": false,\n" +
            "              \"form_type\": \"button\",\n" +
            "              \"placeholder\": \"\",\n" +
            "              \"type\": \"triggerJourney\",\n" +
            "              \"required\": false,\n" +
            "              \"uniqueIdentifier\": \"applicantMobileNumber\",\n" +
            "              \"token\": false\n" +
            "            }\n" +
            "          },\n" +
            "          \"value\": false\n" +
            "        },\n" +
            "        {\n" +
            "          \"iconKey\": \"TRIGGER\",\n" +
            "          \"id\": \"triggerkulizaPersonalLoan2\",\n" +
            "          \"label\": \"Test Journey\",\n" +
            "          \"params\": {\n" +
            "            \"meta\": {\n" +
            "              \"journeyName\": \"testJourneyM\",\n" +
            "              \"default\": \"\",\n" +
            "              \"disabled\": false,\n" +
            "              \"form_type\": \"button\",\n" +
            "              \"placeholder\": \"\",\n" +
            "              \"type\": \"triggerJourney\",\n" +
            "              \"required\": false,\n" +
            "              \"token\": false\n" +
            "            }\n" +
            "          },\n" +
            "          \"value\": false\n" +
            "        }\n" +
            "      ],\n" +
            "      \"productLabel\": \"Personal Loan ----\",\n" +
            "      \"productType\": \"test2224\",\n" +
            "      \"roleLabel\": \"\",\n" +
            "      \"roleName\": \"cmmnCreditAnalystPOCAdmin\",\n" +
            "      \"userId\": \"cmmnuser@kuliza.com\"\n" +
            "    }";

    public static final String UPDATE_CONFIGURE_PORTAL_URL = "/configurator/update-product-config";

    public static final String POST_ADD_BUCKET_CONFIG_URL = "/configurator/cmmnCreditAnalystPOCAdmin/test1237/add-bucket-config";

    public static final String POST_SET_COMMENT = "/cmmnCreditAnalystPOCAdmin/fe8d2958-ade9-11e9-b2cc-02424603bcf2/cmmnCreditAnalystPOCSummary/comment";

    public static final String POST_CREATE_URL_MAPPING_URL = "/create-custom-url-mapping";
    public static final String CUSTOM_URL_MAPPER_REQUEST_BODY_LIST = "[\n" +
            "    {\n" +
            "        \"bulkActionUrl\": null,\n" +
            "        \"customActionUrl\": null,\n" +
            "        \"externalApi\": true,\n" +
            "        \"headers\": [\n" +
            "            {\n" +
            "                \"key\": \"Content-Type\",\n" +
            "                \"value\": \"application/json\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"id\": 42,\n" +
            "        \"openApi\": true,\n" +
            "        \"portalType\": \"BackOffice\",\n" +
            "        \"requestType\": \"POST\",\n" +
            "        \"slug\": \"productTest\",\n" +
            "        \"url\": \"http://kuliza.mockable.io/productTest\",\n" +
            "        \"userId\": \"caadmintest@kuliza.com\"\n" +
            "    }\n" +
            "]";

    public static final String UPDATE_CREATE_URL_MAPPING_URL = "/update-custom-url-mapping?slug=productTest";

    public static final String SUBMIT_VARIABLES_URL = "/submit-variables?caseInstanceId=fe8d2958-ade9-11e9-b2cc-02424603bcf2";
    public static final String CASE_VARIABLES = "{\n" +
            "    \"creditAnalystAdminAssign\": \"ca1@kuliza.com\",\n" +
            "    \"cmmnCreditAnalystPOCStatus\": \"pending\",\n" +
            "    \"cmmnBranchManagerPOCStatus\": \"assigned\"\n" +
            "}";
    public static final String SUBMIT_VARIABLES_REQUEST_BODY = "{\n" +
            "    \"creditAnalystAdminAssign\": \"ca1@kuliza.com\",\n" +
            "    \"cmmnCreditAnalystPOCStatus\": \"pending\",\n" +
            "    \"cmmnBranchManagerPOCStatus\": \"assigned\"\n" +
            "}";
    public static final String SUBMIT_VARIABLES_RESPONSE_BODY = "{\n" +
            "    \"data\": {\n" +
            "        \"creditAnalystAdminAssign\": \"ca1@kuliza.com\",\n" +
            "        \"cmmnCreditAnalystPOCStatus\": \"pending\",\n" +
            "        \"cmmnBranchManagerPOCStatus\": \"assigned\"\n" +
            "    },\n" +
            "    \"message\": \"SUCCESS!\",\n" +
            "    \"status\": 200\n" +
            "}";

    public static final String CLAIM_CASE_URL = "/claim";
    public static final String CLAIM_UN_CLAIM_REQUEST_BODY = "{\n" +
            " \"roleName\":\"cmmnCreditAnalystPOC\",\n" +
            " \"caseInstanceId\":\"123d5e0a-7d53-11e9-a197-42010aa0001b\",\n" +
            " \"newAssignee\":\"cmmnadmin@kuliza.com\",\n" +
            " \"currentAssignee\":\"cmmnuser@kuliza.com\",\n" +
            " \"bucketKey\":\"34\"\n" +
            "}";
    public static final String CLAIM_CASE_API_RESPONSE_BODY = "{\n" +
            "    \"data\": null,\n" +
            "    \"message\": \"Already claimed\",\n" +
            "    \"status\": 400\n" +
            "}";

    public static final String UNCLAIM_CASE_URL = "/unclaim";
    public static final String UNCLAIM_UN_CLAIM_REQUEST_BODY = "{\n" +
            " \"roleName\":\"cmmnCreditAnalystPOC\",\n" +
            " \"caseInstanceId\":\"fe8d2958-ade9-11e9-b2cc-02424603bcf2\",\n" +
            " \"newAssignee\":\"cmmnadmin@kuliza.com\",\n" +
            " \"currentAssignee\":\"cmmnuser@kuliza.com\",\n" +
            " \"bucketKey\":\"34\"\n" +
            "}";
    public static final String UNCLAIM_CASE_API_RESPONSE_BODY = "{\n" +
            "    \"data\": null,\n" +
            "    \"message\": \"SUCCESS!\",\n" +
            "    \"status\": 200\n" +
            "}";

    public static final String REASSIGN_URL = "/reassign";
    public static final String REASSIGN_RESPONSE = "{\n" +
            "    \"data\": null,\n" +
            "    \"message\": \"Unable to reassign\",\n" +
            "    \"status\": 400\n" +
            "}";

    public static final String SET_TAB_COMMENT_URL = "/cmmnCreditAnalystPOCAdmin/3960b03a-6a4b-11e9-970a-42010aa0001b/personalDetail/comment";
    public static final String SET_TAB_COMMENT_REQUEST_BODY = "{\"message\":\"jjnkev\"}";
    public static final String SET_TAB_COMMENT_RESPONSE = "{\n" +
            "    \"data\": {\n" +
            "        \"commentType\": null,\n" +
            "        \"createdTime\": \"02-13-2020 01:10:23\",\n" +
            "        \"id\": 3161,\n" +
            "        \"message\": \"jjnkev\",\n" +
            "        \"modifiedTime\": \"02-13-2020 01:10:23\",\n" +
            "        \"portalUser\": {\n" +
            "            \"applicationNumber\": \"3469639\",\n" +
            "            \"caseInstanceId\": \"3960b03a-6a4b-11e9-970a-42010aa0001b\",\n" +
            "            \"caseName\": \"kulizaBackofficePortal\",\n" +
            "            \"id\": 100,\n" +
            "            \"portalType\": \"BACKOFFICE\"\n" +
            "        },\n" +
            "        \"roleName\": \"cmmnCreditAnalystPOCAdmin\",\n" +
            "        \"taskKey\": \"personalDetail\",\n" +
            "        \"userId\": \"cmmnuser@kuliza.com\"\n" +
            "    },\n" +
            "    \"message\": \"SUCCESS!\",\n" +
            "    \"status\": 200\n" +
            "}";

    public static final String DELETE_PRODUCT_URL = "/configurator/cmmnCreditAnalystPOCAdmin/kulizaPersonalLoan1114334";
    public static final String DELETE_PRODUCT_RESPONSE = "{\n" +
            "    \"data\": null,\n" +
            "    \"message\": \"Portal Configuration does not exists\",\n" +
            "    \"status\": 400\n" +
            "}";

    public static final String DELETE_CUSTOM_URL_MAPPING_URL = "/delete-custom-url-mapping?slug=panNumber";
    public static final String DELETE_CUSTOM_URL_MAPPER_RESPONSE = "{\n" +
            "    \"data\": null,\n" +
            "    \"message\": \"CustomURLMapper with this id does not exist\",\n" +
            "    \"status\": 400\n" +
            "}";

    public static final String INITIATE_CASE_URL = "/initiate?caseName=kulizaBackofficePortal&applicationNumber=725";
    public static final String INITIATE_PORTAL_DATA = "{\n" +
            "    \"portalType\": \"BACKOFFICE\",\n" +
            "    \"sourceId\": \"068a2bdc-f0c6-11e9-af7b-02426aceaa3e\",\n" +
            "    \"sourceType\": \"JOURNEY\",\n" +
            "    \"variablesToSave\": {\n" +
            "        \"cmmnCreditAnalystPOCStatus\": \"pending\",\n" +
            "        \"lastName\": \"\",\n" +
            "        \"portalPortfolioKey\": \"applicantPan\",\n" +
            "        \"addressInformation\": \"\",\n" +
            "        \"initiator\": \"user@4753.com\",\n" +
            "        \"currentCity\": \"\",\n" +
            "        \"emailaddress\": \"\",\n" +
            "        \"loanAmount\": \"\",\n" +
            "        \"pinCodeHome\": \"\",\n" +
            "        \"firstName\": \"UDIT\",\n" +
            "        \"journeyType\": \"kulizaPersonalLoan1\",\n" +
            "        \"cmmnCreditAnalystPOCAdminStatus\": \"pending\",\n" +
            "        \"applicantPan\": \"BMUPK0923C\",\n" +
            "        \"customerId\": \"10001\",\n" +
            "        \"applicantMobileNumber\": \"9887765656\",\n" +
            "        \"personalDetails\": \"\",\n" +
            "        \"middleName\": \"\",\n" +
            "        \"currentAddress2\": \"\",\n" +
            "        \"assignee\": \"user@4753.com\",\n" +
            "        \"currentAddress1\": \"\",\n" +
            "        \"applicationId\": 1493,\n" +
            "        \"currentState\": \"\"\n" +
            "    },\n" +
            "    \"sourceProcessName\": \"kulizaPersonalLoan1\"\n" +
            "}";

    public static final String SUBMIT_OR_GET_CASE_VARIABLES_URL = "/get-variables?caseInstanceId=fe8d2958-ade9-11e9-b2cc-02424603bcf2";
    public static final String SUBMIT_OR_GET_CASE_VARIABLES_RESPONSE = "{\n" +
            "    \"data\": {\n" +
            "        \"lastName\": \"G\",\n" +
            "        \"dedupeResultClone_cpa_sme\": \"[{\\\"applicantTypeDedupe_dedupe_sme\\\":\\\"Applicant\\\",\\\"RefReqstId\\\":\\\"WVrkgZTs5z\\\",\\\"partyNameDedupe_dedupe_sme\\\":\\\"first\\\"},{\\\"applicantTypeDedupe_dedupe_sme\\\":\\\"Co-Applicant\\\",\\\"RefReqstId\\\":\\\"QVRDDB1z0v\\\",\\\"partyNameDedupe_dedupe_sme\\\":\\\"second\\\"},{\\\"applicantTypeDedupe_dedupe_sme\\\":\\\"Co-Applicant\\\",\\\"RefReqstId\\\":\\\"abc\\\",\\\"partyNameDedupe_dedupe_sme\\\":\\\"third\\\"}]\",\n" +
            "        \"portalVisitedTabs\": {\n" +
            "            \"cmmnCreditAnalystPOCAdmin-cmmnuser@kuliza.com\": [\n" +
            "                \"personalAddressDetail\",\n" +
            "                \"cmmnCreditAnalystPOCSummary\",\n" +
            "                \"other\",\n" +
            "                \"personalDetail\",\n" +
            "                \"magmaDedupe\"\n" +
            "            ]\n" +
            "        },\n" +
            "        \"cmmnBranchManagerPOCStatus\": \"assigned\",\n" +
            "        \"initiator\": \"user@1383.com\",\n" +
            "        \"currentCity\": \"Bengaluru\",\n" +
            "        \"cmmnCreditAnalystPOCAssignee\": \"cmmnuser@kuliza.com\",\n" +
            "        \"cmmnCreditAnalystPOCAdminAssignee\": \"cmmnuser@kuliza.com\",\n" +
            "        \"pinCodeHome\": \"7657657\",\n" +
            "        \"countTest\": \"\",\n" +
            "        \"priceAvg\": \"\",\n" +
            "        \"customerId\": \"10001\",\n" +
            "        \"BACKOFFICEPortalId\": 854,\n" +
            "        \"cmmnCreditAnalystPOCStatus\": \"pending\",\n" +
            "        \"portalPortfolioKey\": \"customerId\",\n" +
            "        \"addressInformation\": \"\",\n" +
            "        \"caseDefinitionId\": \"de3b8af4-ade9-11e9-92be-02424603bcf2\",\n" +
            "        \"caseInstanceId\": \"fe8d2958-ade9-11e9-b2cc-02424603bcf2\",\n" +
            "        \"emailaddress\": \"\",\n" +
            "        \"creditAnalystAdminAssign\": \"ca1@kuliza.com\",\n" +
            "        \"loanAmount\": \"98789798\",\n" +
            "        \"firstName\": \"MANDIP\",\n" +
            "        \"portfolioId\": \"534bf95e-9416-11e9-93c0-0242c7004e1a\",\n" +
            "        \"journeyType\": \"kulizaPersonalLoan1\",\n" +
            "        \"applicantPan\": \"BNHPL1234G\",\n" +
            "        \"applicantMobileNumber\": \"8767676272\",\n" +
            "        \"personalDetails\": \"\",\n" +
            "        \"middleName\": \"\",\n" +
            "        \"currentAddress2\": \"ytytyry\",\n" +
            "        \"assignee\": \"user@1383.com\",\n" +
            "        \"currentAddress1\": \"tryrytr\",\n" +
            "        \"applicationId\": \"1000\",\n" +
            "        \"currentState\": \"Karnataka\",\n" +
            "        \"leadid\": \"LP/BC/P/19/09253\"\n" +
            "    },\n" +
            "    \"message\": \"SUCCESS!\",\n" +
            "    \"status\": 200\n" +
            "}";

    public static final String PARTIAL_SUBMIT_FORM_URL = "/get-form?caseInstanceId=5cfd4e36-5a18-11e9-880c-02426ed2fcfa";
    public static final String PARTIAL_SUBMIT_FORM_RESPONSE = "{\n" +
            "    \"data\": {\n" +
            "        \"data\": {\n" +
            "            \"applicationId\": \"279\"\n" +
            "        },\n" +
            "        \"caseInstanceId\": \"5cfd4e36-5a18-11e9-880c-02426ed2fcfa\",\n" +
            "        \"cmmnCreditAnalystPOC-list\": {\n" +
            "            \"jcurAdd1\": {\n" +
            "                \"isRequired\": true,\n" +
            "                \"name\": \"Current Address Line 1\",\n" +
            "                \"id\": \"jcurAdd1\",\n" +
            "                \"isWritable\": true,\n" +
            "                \"type\": \"text\",\n" +
            "                \"params\": {\n" +
            "                    \"meta\": {\n" +
            "                        \"type\": \"string\",\n" +
            "                        \"form_type\": \"text\",\n" +
            "                        \"default\": \"\",\n" +
            "                        \"order\": 20,\n" +
            "                        \"required\": true,\n" +
            "                        \"disabled\": false,\n" +
            "                        \"placeholder\": false,\n" +
            "                        \"api\": \"\",\n" +
            "                        \"validator\": \"[]\",\n" +
            "                        \"newRow\": true,\n" +
            "                        \"colWidth\": 6\n" +
            "                    }\n" +
            "                },\n" +
            "                \"value\": null,\n" +
            "                \"enumValues\": null\n" +
            "            },\n" +
            "            \"jCurPer\": {\n" +
            "                \"isRequired\": true,\n" +
            "                \"name\": \"Is your current address same as your permanent address?\",\n" +
            "                \"id\": \"jCurPer\",\n" +
            "                \"isWritable\": true,\n" +
            "                \"type\": \"radio-buttons\",\n" +
            "                \"params\": {\n" +
            "                    \"meta\": {\n" +
            "                        \"type\": \"string\",\n" +
            "                        \"form_type\": \"radio\",\n" +
            "                        \"default\": \"\",\n" +
            "                        \"order\": 10,\n" +
            "                        \"required\": true,\n" +
            "                        \"disabled\": false,\n" +
            "                        \"placeholder\": false,\n" +
            "                        \"api\": \"\",\n" +
            "                        \"validator\": \"[]\",\n" +
            "                        \"display-on-selection\": {\n" +
            "                            \"no\": [\n" +
            "                                \"jcurAdd1\",\n" +
            "                                \"jCurAdd2\",\n" +
            "                                \"jcurPincode\",\n" +
            "                                \"curCity\",\n" +
            "                                \"curState\"\n" +
            "                            ],\n" +
            "                            \"yes\": []\n" +
            "                        },\n" +
            "                        \"colWidth\": 12\n" +
            "                    }\n" +
            "                },\n" +
            "                \"value\": null,\n" +
            "                \"enumValues\": [\n" +
            "                    {\n" +
            "                        \"id\": \"yes\",\n" +
            "                        \"name\": \"Yes\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": \"no\",\n" +
            "                        \"name\": \"No\"\n" +
            "                    }\n" +
            "                ]\n" +
            "            },\n" +
            "            \"curState\": {\n" +
            "                \"isRequired\": true,\n" +
            "                \"name\": \"State\",\n" +
            "                \"id\": \"curState\",\n" +
            "                \"isWritable\": true,\n" +
            "                \"type\": \"text\",\n" +
            "                \"params\": {\n" +
            "                    \"meta\": {\n" +
            "                        \"type\": \"string\",\n" +
            "                        \"form_type\": \"text\",\n" +
            "                        \"default\": \"\",\n" +
            "                        \"order\": 60,\n" +
            "                        \"required\": true,\n" +
            "                        \"disabled\": false,\n" +
            "                        \"placeholder\": false,\n" +
            "                        \"api\": \"\",\n" +
            "                        \"validator\": \"[]\",\n" +
            "                        \"colWidth\": 4\n" +
            "                    }\n" +
            "                },\n" +
            "                \"value\": null,\n" +
            "                \"enumValues\": null\n" +
            "            },\n" +
            "            \"jCurAdd2\": {\n" +
            "                \"isRequired\": true,\n" +
            "                \"name\": \"Current Address Line 2\",\n" +
            "                \"id\": \"jCurAdd2\",\n" +
            "                \"isWritable\": true,\n" +
            "                \"type\": \"text\",\n" +
            "                \"params\": {\n" +
            "                    \"meta\": {\n" +
            "                        \"type\": \"string\",\n" +
            "                        \"form_type\": \"text\",\n" +
            "                        \"default\": \"\",\n" +
            "                        \"order\": 30,\n" +
            "                        \"required\": true,\n" +
            "                        \"disabled\": false,\n" +
            "                        \"placeholder\": false,\n" +
            "                        \"api\": \"\",\n" +
            "                        \"validator\": \"[]\",\n" +
            "                        \"colWidth\": 6\n" +
            "                    }\n" +
            "                },\n" +
            "                \"value\": null,\n" +
            "                \"enumValues\": null\n" +
            "            },\n" +
            "            \"jcurPincode\": {\n" +
            "                \"isRequired\": true,\n" +
            "                \"name\": \"Pincode\",\n" +
            "                \"id\": \"jcurPincode\",\n" +
            "                \"isWritable\": true,\n" +
            "                \"type\": \"integer\",\n" +
            "                \"params\": {\n" +
            "                    \"meta\": {\n" +
            "                        \"type\": \"rest\",\n" +
            "                        \"form_type\": \"number\",\n" +
            "                        \"default\": \"\",\n" +
            "                        \"order\": 40,\n" +
            "                        \"required\": true,\n" +
            "                        \"disabled\": false,\n" +
            "                        \"placeholder\": false,\n" +
            "                        \"api\": {\n" +
            "                            \"url\": \"http://35.229.102.91/journey/api/pin\",\n" +
            "                            \"method\": \"GET\",\n" +
            "                            \"data\": {\n" +
            "                                \"pin\": \"jcurPincode\"\n" +
            "                            },\n" +
            "                            \"mapping\": {\n" +
            "                                \"curCity\": \"data.district\",\n" +
            "                                \"curState\": \"data.state\"\n" +
            "                            }\n" +
            "                        },\n" +
            "                        \"validator\": \"[]\",\n" +
            "                        \"newRow\": true,\n" +
            "                        \"colWidth\": 4\n" +
            "                    }\n" +
            "                },\n" +
            "                \"value\": null,\n" +
            "                \"enumValues\": null\n" +
            "            },\n" +
            "            \"curCity\": {\n" +
            "                \"isRequired\": true,\n" +
            "                \"name\": \"City\",\n" +
            "                \"id\": \"curCity\",\n" +
            "                \"isWritable\": true,\n" +
            "                \"type\": \"text\",\n" +
            "                \"params\": {\n" +
            "                    \"meta\": {\n" +
            "                        \"type\": \"string\",\n" +
            "                        \"form_type\": \"text\",\n" +
            "                        \"default\": \"\",\n" +
            "                        \"order\": 50,\n" +
            "                        \"required\": true,\n" +
            "                        \"disabled\": false,\n" +
            "                        \"placeholder\": false,\n" +
            "                        \"api\": \"\",\n" +
            "                        \"validator\": \"[]\",\n" +
            "                        \"colWidth\": 4\n" +
            "                    }\n" +
            "                },\n" +
            "                \"value\": null,\n" +
            "                \"enumValues\": null\n" +
            "            }\n" +
            "        },\n" +
            "        \"stepperData\": null,\n" +
            "        \"taskId\": \"5d731a85-5a18-11e9-880c-02426ed2fcfa\"\n" +
            "    },\n" +
            "    \"errorMessage\": \"\",\n" +
            "    \"message\": \"SUCCESS!\",\n" +
            "    \"screenInfo\": \"cmmnCreditAnalystPOC-list\",\n" +
            "    \"screenName\": \"List\",\n" +
            "    \"status\": 200\n" +
            "}";

    public static final String PARTIAL_SUBMIT_FORM_DATA_URL = "/partial-submit-form";
    public static final String PARTIAL_SUBMIT_FORM_DATA_REQUEST_BODY = "{\n" +
            "  \"taskId\": \"ffff7b90-f4b2-11e9-8129-04ea56aaf7a8\",\n" +
            "   \"caseInstanceId\": \"fff62c81-f4b2-11e9-8129-04ea56aaf7a8\",\n" +
            "   \"formProperties\": {\n" +
            "     \"lastName\":\"bansal\"\n" +
            "   }\n" +
            "}";
    public static final String PARTIAL_SUBMIT_FORM_DATA_RESPONSE = "{\n" +
            "    \"data\": {\n" +
            "        \"data\": {\n" +
            "            \"applicationId\": \"SUM(B484, 1)\"\n" +
            "        },\n" +
            "        \"caseInstanceId\": \"fff62c81-f4b2-11e9-8129-04ea56aaf7a8\",\n" +
            "        \"personalAddressDetail\": {\n" +
            "            \"permanentAddress2\": {\n" +
            "                \"isRequired\": false,\n" +
            "                \"name\": \"Address Line 2\",\n" +
            "                \"id\": \"permanentAddress2\",\n" +
            "                \"isWritable\": true,\n" +
            "                \"type\": \"text\",\n" +
            "                \"params\": {\n" +
            "                    \"meta\": {\n" +
            "                        \"type\": \"string\",\n" +
            "                        \"form_type\": \"text\",\n" +
            "                        \"default\": \"\",\n" +
            "                        \"required\": false,\n" +
            "                        \"order\": 9,\n" +
            "                        \"disabled\": false,\n" +
            "                        \"placeholder\": false,\n" +
            "                        \"api\": \"\",\n" +
            "                        \"validator\": \"[]\",\n" +
            "                        \"colWidth\": 12\n" +
            "                    }\n" +
            "                },\n" +
            "                \"value\": null,\n" +
            "                \"enumValues\": null\n" +
            "            },\n" +
            "            \"permanentAddress1\": {\n" +
            "                \"isRequired\": false,\n" +
            "                \"name\": \"Address Line 1\",\n" +
            "                \"id\": \"permanentAddress1\",\n" +
            "                \"isWritable\": true,\n" +
            "                \"type\": \"text\",\n" +
            "                \"params\": {\n" +
            "                    \"meta\": {\n" +
            "                        \"type\": \"string\",\n" +
            "                        \"form_type\": \"text\",\n" +
            "                        \"default\": \"\",\n" +
            "                        \"required\": false,\n" +
            "                        \"order\": 8,\n" +
            "                        \"disabled\": false,\n" +
            "                        \"placeholder\": false,\n" +
            "                        \"api\": \"\",\n" +
            "                        \"validator\": \"[]\",\n" +
            "                        \"colWidth\": 12\n" +
            "                    }\n" +
            "                },\n" +
            "                \"value\": null,\n" +
            "                \"enumValues\": null\n" +
            "            },\n" +
            "            \"currentAddress2\": {\n" +
            "                \"isRequired\": true,\n" +
            "                \"name\": \"Address Line 2\",\n" +
            "                \"id\": \"currentAddress2\",\n" +
            "                \"isWritable\": true,\n" +
            "                \"type\": \"text\",\n" +
            "                \"params\": {\n" +
            "                    \"meta\": {\n" +
            "                        \"type\": \"string\",\n" +
            "                        \"form_type\": \"text\",\n" +
            "                        \"default\": \"\",\n" +
            "                        \"required\": true,\n" +
            "                        \"order\": 3,\n" +
            "                        \"disabled\": false,\n" +
            "                        \"placeholder\": false,\n" +
            "                        \"api\": \"\",\n" +
            "                        \"validator\": \"[]\",\n" +
            "                        \"newRow\": true,\n" +
            "                        \"colWidth\": 12\n" +
            "                    }\n" +
            "                },\n" +
            "                \"value\": \"\",\n" +
            "                \"enumValues\": null\n" +
            "            },\n" +
            "            \"currentCity\": {\n" +
            "                \"isRequired\": true,\n" +
            "                \"name\": \"City\",\n" +
            "                \"id\": \"currentCity\",\n" +
            "                \"isWritable\": true,\n" +
            "                \"type\": \"text\",\n" +
            "                \"params\": {\n" +
            "                    \"meta\": {\n" +
            "                        \"type\": \"string\",\n" +
            "                        \"form_type\": \"text\",\n" +
            "                        \"default\": \"\",\n" +
            "                        \"required\": true,\n" +
            "                        \"order\": 5,\n" +
            "                        \"disabled\": false,\n" +
            "                        \"placeholder\": false,\n" +
            "                        \"api\": \"\",\n" +
            "                        \"validator\": \"[]\",\n" +
            "                        \"colWidth\": 6\n" +
            "                    }\n" +
            "                },\n" +
            "                \"value\": \"\",\n" +
            "                \"enumValues\": null\n" +
            "            },\n" +
            "            \"currentAddress1\": {\n" +
            "                \"isRequired\": true,\n" +
            "                \"name\": \"Address Line 1\",\n" +
            "                \"id\": \"currentAddress1\",\n" +
            "                \"isWritable\": true,\n" +
            "                \"type\": \"text\",\n" +
            "                \"params\": {\n" +
            "                    \"meta\": {\n" +
            "                        \"type\": \"string\",\n" +
            "                        \"form_type\": \"text\",\n" +
            "                        \"default\": \"\",\n" +
            "                        \"required\": true,\n" +
            "                        \"order\": 2,\n" +
            "                        \"disabled\": false,\n" +
            "                        \"placeholder\": false,\n" +
            "                        \"api\": \"\",\n" +
            "                        \"validator\": \"[]\",\n" +
            "                        \"colWidth\": 12\n" +
            "                    }\n" +
            "                },\n" +
            "                \"value\": \"\",\n" +
            "                \"enumValues\": null\n" +
            "            },\n" +
            "            \"permanentAddress\": {\n" +
            "                \"isRequired\": false,\n" +
            "                \"name\": \"Permanent Address\",\n" +
            "                \"id\": \"permanentAddress\",\n" +
            "                \"isWritable\": true,\n" +
            "                \"type\": \"text\",\n" +
            "                \"params\": {\n" +
            "                    \"meta\": {\n" +
            "                        \"type\": \"string\",\n" +
            "                        \"form_type\": \"card\",\n" +
            "                        \"default\": \"\",\n" +
            "                        \"required\": false,\n" +
            "                        \"order\": 7,\n" +
            "                        \"disabled\": false,\n" +
            "                        \"placeholder\": false,\n" +
            "                        \"api\": \"\",\n" +
            "                        \"validator\": \"[]\",\n" +
            "                        \"children\": [\n" +
            "                            \"permanentAddress1\",\n" +
            "                            \"permanentAddress2\",\n" +
            "                            \"permanentPincode\",\n" +
            "                            \"permanentCity\",\n" +
            "                            \"permanentState\"\n" +
            "                        ]\n" +
            "                    }\n" +
            "                },\n" +
            "                \"value\": null,\n" +
            "                \"enumValues\": null\n" +
            "            },\n" +
            "            \"permanentCity\": {\n" +
            "                \"isRequired\": false,\n" +
            "                \"name\": \"City\",\n" +
            "                \"id\": \"permanentCity\",\n" +
            "                \"isWritable\": true,\n" +
            "                \"type\": \"text\",\n" +
            "                \"params\": {\n" +
            "                    \"meta\": {\n" +
            "                        \"type\": \"string\",\n" +
            "                        \"form_type\": \"text\",\n" +
            "                        \"default\": \"\",\n" +
            "                        \"required\": true,\n" +
            "                        \"order\": 11,\n" +
            "                        \"disabled\": false,\n" +
            "                        \"placeholder\": false,\n" +
            "                        \"api\": \"\",\n" +
            "                        \"validator\": \"[]\",\n" +
            "                        \"colWidth\": 6\n" +
            "                    }\n" +
            "                },\n" +
            "                \"value\": null,\n" +
            "                \"enumValues\": null\n" +
            "            },\n" +
            "            \"currentState\": {\n" +
            "                \"isRequired\": true,\n" +
            "                \"name\": \"State\",\n" +
            "                \"id\": \"currentState\",\n" +
            "                \"isWritable\": true,\n" +
            "                \"type\": \"text\",\n" +
            "                \"params\": {\n" +
            "                    \"meta\": {\n" +
            "                        \"type\": \"string\",\n" +
            "                        \"form_type\": \"text\",\n" +
            "                        \"default\": \"\",\n" +
            "                        \"required\": true,\n" +
            "                        \"order\": 6,\n" +
            "                        \"disabled\": false,\n" +
            "                        \"placeholder\": false,\n" +
            "                        \"api\": \"\",\n" +
            "                        \"validator\": \"[]\",\n" +
            "                        \"colWidth\": 6\n" +
            "                    }\n" +
            "                },\n" +
            "                \"value\": \"\",\n" +
            "                \"enumValues\": null\n" +
            "            },\n" +
            "            \"permanentState\": {\n" +
            "                \"isRequired\": false,\n" +
            "                \"name\": \"State\",\n" +
            "                \"id\": \"permanentState\",\n" +
            "                \"isWritable\": true,\n" +
            "                \"type\": \"text\",\n" +
            "                \"params\": {\n" +
            "                    \"meta\": {\n" +
            "                        \"type\": \"string\",\n" +
            "                        \"form_type\": \"text\",\n" +
            "                        \"default\": \"\",\n" +
            "                        \"required\": true,\n" +
            "                        \"order\": 12,\n" +
            "                        \"disabled\": false,\n" +
            "                        \"placeholder\": false,\n" +
            "                        \"api\": \"\",\n" +
            "                        \"validator\": \"[]\",\n" +
            "                        \"colWidth\": 6\n" +
            "                    }\n" +
            "                },\n" +
            "                \"value\": null,\n" +
            "                \"enumValues\": null\n" +
            "            },\n" +
            "            \"permanentPincode\": {\n" +
            "                \"isRequired\": false,\n" +
            "                \"name\": \"Pincode\",\n" +
            "                \"id\": \"permanentPincode\",\n" +
            "                \"isWritable\": true,\n" +
            "                \"type\": \"integer\",\n" +
            "                \"params\": {\n" +
            "                    \"meta\": {\n" +
            "                        \"type\": \"number\",\n" +
            "                        \"form_type\": \"number\",\n" +
            "                        \"default\": \"\",\n" +
            "                        \"required\": true,\n" +
            "                        \"order\": 10,\n" +
            "                        \"disabled\": false,\n" +
            "                        \"placeholder\": false,\n" +
            "                        \"api\": \"\",\n" +
            "                        \"validator\": \"[]\",\n" +
            "                        \"colWidth\": 6\n" +
            "                    }\n" +
            "                },\n" +
            "                \"value\": null,\n" +
            "                \"enumValues\": null\n" +
            "            },\n" +
            "            \"currentAddress\": {\n" +
            "                \"isRequired\": false,\n" +
            "                \"name\": \"Current Address\",\n" +
            "                \"id\": \"currentAddress\",\n" +
            "                \"isWritable\": true,\n" +
            "                \"type\": \"text\",\n" +
            "                \"params\": {\n" +
            "                    \"meta\": {\n" +
            "                        \"type\": \"string\",\n" +
            "                        \"form_type\": \"card\",\n" +
            "                        \"default\": \"\",\n" +
            "                        \"required\": false,\n" +
            "                        \"order\": 1,\n" +
            "                        \"disabled\": false,\n" +
            "                        \"placeholder\": false,\n" +
            "                        \"api\": \"\",\n" +
            "                        \"validator\": \"[]\",\n" +
            "                        \"children\": [\n" +
            "                            \"currentAddress1\",\n" +
            "                            \"currentAddress2\",\n" +
            "                            \"pinCodeHome\",\n" +
            "                            \"currentCity\",\n" +
            "                            \"currentState\"\n" +
            "                        ]\n" +
            "                    }\n" +
            "                },\n" +
            "                \"value\": null,\n" +
            "                \"enumValues\": null\n" +
            "            },\n" +
            "            \"pinCodeHome\": {\n" +
            "                \"isRequired\": true,\n" +
            "                \"name\": \"Pincode\",\n" +
            "                \"id\": \"pinCodeHome\",\n" +
            "                \"isWritable\": true,\n" +
            "                \"type\": \"integer\",\n" +
            "                \"params\": {\n" +
            "                    \"meta\": {\n" +
            "                        \"type\": \"number\",\n" +
            "                        \"form_type\": \"number\",\n" +
            "                        \"default\": \"\",\n" +
            "                        \"required\": true,\n" +
            "                        \"order\": 4,\n" +
            "                        \"disabled\": false,\n" +
            "                        \"placeholder\": false,\n" +
            "                        \"api\": \"\",\n" +
            "                        \"validator\": \"[]\",\n" +
            "                        \"colWidth\": 6\n" +
            "                    }\n" +
            "                },\n" +
            "                \"value\": \"\",\n" +
            "                \"enumValues\": null\n" +
            "            }\n" +
            "        },\n" +
            "        \"stepperData\": null,\n" +
            "        \"taskId\": \"ffff7b89-f4b2-11e9-8129-04ea56aaf7a8\"\n" +
            "    },\n" +
            "    \"errorMessage\": \"\",\n" +
            "    \"message\": \"SUCCESS!\",\n" +
            "    \"screenInfo\": \"personalAddressDetail\",\n" +
            "    \"screenName\": \"Address Details -  Personal\",\n" +
            "    \"status\": 200\n" +
            "}";

    public static final String SUBMIT_FORM_DATA_URL = "/submit-form";
    public static final String SUBMIT_FORM_DATA_RESPONSE = "{\n" +
            "    \"data\": null,\n" +
            "    \"message\": \"INCORRECT TASK ID!\",\n" +
            "    \"status\": 400\n" +
            "}";

    public static final String  EXPORT_CUSTOM_ACTION_CONFIGURATION_URL = "/custom-action/export?slug=restapi1";
    public static final String  EXPORT_CUSTOM_ACTION_CONFIGURATION_RESPONSE = "{\n" +
            "    \"data\": {\n" +
            "        \"bulkActionUrl\": null,\n" +
            "        \"customActionUrl\": null,\n" +
            "        \"externalApi\": true,\n" +
            "        \"headers\": [\n" +
            "            {\n" +
            "                \"key\": \"Content-Type\",\n" +
            "                \"value\": \"application/json\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"id\": 30,\n" +
            "        \"openApi\": true,\n" +
            "        \"portalType\": \"string\",\n" +
            "        \"requestType\": \"POST\",\n" +
            "        \"slug\": \"restapi1\",\n" +
            "        \"url\": \"http://kuliza.mockable.io/pan\",\n" +
            "        \"userId\": \"caadmintest@kuliza.com\"\n" +
            "    },\n" +
            "    \"message\": \"SUCCESS!\",\n" +
            "    \"status\": 200\n" +
            "}";

    public static final String IMPORT_CUSTOM_ACTION_CONFIGURATION_URL = "/custom-action/import";
    public static final String IMPORT_CUSTOM_ACTION_CONFIGURATION_RESPONSE = "{\n" +
            "    \"data\": null,\n" +
            "    \"message\": \"SUCCESS!\",\n" +
            "    \"status\": 200\n" +
            "}";





}
