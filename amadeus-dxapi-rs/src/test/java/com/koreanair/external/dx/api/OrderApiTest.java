/**
 * Amadeus Digital Experience API
 * # API information The document aims at describing the Amadeus Digital Experience API.  Through Digital API, an end user is able to search air offers and related services, add all necessary information to complete a booking, display a seatmap and select seats, add traveler preferences such as meal and finally finalize a booking (creation of an order). API also allows retrieving an existing order. Since the API is REST, operations are not flow related.  ## CRUD operations We do our best to have all our URLs be [RESTful](http://en.wikipedia.org/wiki/Representational_state_transfer). Every endpoint (URL) may support one of five different http verbs. GET requests fetch information about an object, POST requests create objects, PUT requests update objects and DELETE requests will delete objects. PATCH [JSON Merge Patch](https://tools.ietf.org/html/rfc7396) requests perform partial updates.  ## Structure ### The envelope Every response is contained by an envelope. That is, each response has a predictable set of keys with which you can expect to interact: ```json {     \"warnings\": [         ...     ],     \"data\": {         ...     },     \"dictionaries\": {         ...     },     \"errors\": [         ...     ] } ``` #### ERRORS Error messages corresponding to functional blocking issues encountered when processing an operation. When at least one message has a level 'error' nothing has been processed so no 'data' are returned. In this case the HTTP status become 200 for POST (instead of 201) and DELETE (instead of 204).  #### WARNINGS Warning messages corresponding to non blocking issues encountered when processing an operation.  #### DATA The data key is the meat of the response. It contains all information regarding the resource requested.  #### DICTIONARIES Each dictionary contains: - localized data : it's possible to request for a specific code (e.g. location code) the translation in the language code specified as query parameter. The translation applies as well to the related information: in case of location code, type of location (airport or city), corresponding city (for airport location), state, country, etc.) - dictionarized data : information used on different parts of the message can be defined once and referenced via an id. It that case, the id makes the connection between dictionary and data information Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get).  ### Example of request/response When triggering an API operation it is interesting to evaluate the response (or the data model corresponding to the input body in case of POST). ``` GET /carts/{cartId}/travelers/{travelerId} HTTP/1.1 Accept: application/json ```  Multiple errors can occur in response to a single request. The list of error messages is provided by the server: ```json HTTP/1.1 400 Bad Request Content-Type: application/json {   \"errors\": [     {       \"code\": \"04926\",       \"source\": { \"pointer\": \"/names/0/lastName\" },       \"title\": \"INVALID DATA RECEIVED\"       \"detail\": \"must match \\\"^[A-Za-zÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬-ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¿][A-Za-zÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬-ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¿ -.]{1,69}$\\\"     },     {       \"code\": \"36986\",       \"source\": { \"pointer\": \"/0/dateOfBirth\" },       \"detail\": \"Date of birth '2018-07-01' should be in the past\",       \"title\": \"INVALID DATA RECEIVED\"     },   ] } ``` Note: example added for illustration only.  A few considerations on the error message structure: - The title communicates the type of problem encountered. - The code refers to an application-specific code representing the type of problem encountered. Code and title have a similar behaviour, since they communicate which is the problem type. However, it is suggested to rely on the code as a unique identifier. - The detail is used to provide information specific to this occurrence of the problem.  Message may use source to point to the top-level of the document (\"\"). The source member can also be used to indicate that the error originated from a problem with a URI query parameter (parameter field used instead of pointer in that case).  Standard [HTTP response status codes](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes) apply. As such they are not all mentioned below.  ## Top resources ### Cart The central resource is the `Cart` (shopping cart) used at shopping time to prepare a journey (shopping, booking and pricing) and later on to perform servicing on an already booked reservation. A `Cart` gather `AirOffer`s, `Traveler`s as well as `Service`s, `Seat`s, `FrequentFlyerCard`s and `Contact`s. It can be associated to zero, one or more users. At checkout time, an `Order` is created based on content selected from the `Cart`.  ### AirCalendar `Air Calendar` provides the best price per day based on input parameters.  ### AirBound `Air Bound` provides the bound-by-bound shopping proposal based on input parameters. ### AirOffer An `Air Offer` is the result of a shopping proposal. It is a collection of `OfferItem`s, each offer item containing flights.  ### Service The ``Service`` resource allows to access the list of free and/or chargeable services.  ### Seatmap ``Seatmap`` refers to display of the air seat map, allowing the end user to identify the seat to be booked for free or at a charge.  ### Order An ``Order`` corresponds to a reservation record (Amadeus PNRs). The order can contain flights, services and seats, as well as travel documents (E-Tickets and/or EMDs) in case the order has been paid and related tickets issued.  ### Payment Method A `Payment Method` refers to a payment method that be used to pay an order. The following payment methods are supported by DAPI: Payment cards, External  payment, Miles payment and Alternative Payment Method.  ## Secondary resources (main ones) ### Traveler A ``Traveler`` is an individual involved in the booking and taking part in a journey. ### Seat A ``Seat`` refers to the seat that the end user can select as part of the booking. ### Frequent Flyer ``Frequent Flyer`` contains frequent flyer cards either to accrue miles or redeem miles (only accrual supported initially). ### Contact ``Contact`` refers to emails, phone numbers and addresses. ### Travel Document A ``Travel Document`` refers to the tickets (E-Tickets and/or EMDs) issued for flights or services. ### Payment Record A `Payment Record` contains the details of the payment transaction for an order. It includes the payment method used for the order payment, as well additional information such as the approval code for a Credit Card payment. ## Limitations - Only air related content booking is supported. - Only one order is created at a time from the cart. - A cart can only contain one single airOffer.  ## Miscellaneous ### Temporary id (tid) A temporary id (``tid``) can be used to: - identify an object in the request of a POST operation when the id of the object is not known yet.  - identify an object in the response of a PUT operation when the id of the object is changing.  In all cases, a tid is only valid for the time of the transaction   ### Output filtering JSON output can be filtered using ``-fields`` and ``fields`` query parameters, followed by the fully qualified name of the attribute to filter/keep.  Optionally the ``keepRequiredFields`` boolean query parameter can be used to avoid filtering required fields out.  Examples: ``` GET /carts/{cartId}?-fields=data.travelers ``` will filter all travelers out of the response ``` GET /carts/{cartId}?fields=data.travelers.age ``` will keep only age of the travelers in response  Any questions, suggestions or feedbacks, thank you for contacting the DxAPI team  ### Traceability token For better traceability of requests, a traceability token can and should be added to every call to the API.  This token is composed of both a session part and a request part resulting in a unique ID for a single request.  This opens the door for: - Easy retrieval of information regarding that request. - Linking the request to other requests performed in the same user session.  This traceability token is materialized by an ``Ama-Client-Ref`` header to be sent in each and every request.  This header must be formatted as following: ``${SESSION_ID}:${REQUEST_ID}``.  Where: - ``SESSION_ID``: is a client-side generated token identifying the client-side user session matching following regular expression ``[a-zA-Z0-9-]{10,48}``. A recommended way is to implement it as an [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier) in [RFC 4122](https://tools.ietf.org/html/rfc4122) format.    - For example: ``123e4567-e89b-12d3-a456-426655440000``  - ``REQUEST_ID`` is a client-side request id within the client-side user session matching the ``[a-zA-Z0-9]{1,10}`` format.    - For example: ``1``, ``42``, ``5fa2``, ``Px2z5``, ...    - There is no notion of order between two ``REQUEST_ID``    - ``REQUEST_ID`` must be unique within a session.   Examples:  - Request ``2fc0`` within session ``123e4567-e89b-12d3-a456-426655440000`` traceability token:  ``Ama-Client-Ref: 123e4567-e89b-12d3-a456-426655440000:2fc0``     - Request ``7ba19e`` within session ``123e4567-e89b-12d3-a456-426655440000`` traceability token:  ``Ama-Client-Ref: 123e4567-e89b-12d3-a456-426655440000:7ba19e`` 
 *
 * OpenAPI spec version: 2.10.0
 * Contact: DG-CORP-DAPI-Swagger@amadeus.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.koreanair.external.dx.api;

import com.koreanair.external.dx.vo.AlternativeOfferConfirmationReply;
import com.koreanair.external.dx.vo.AlternativeOfferConfirmationRequest;
import com.koreanair.external.dx.vo.Contact;
import com.koreanair.external.dx.vo.ContactReply;
import com.koreanair.external.dx.vo.ContactsListReply;
import com.koreanair.external.dx.vo.FormOfIdentificationDetail;
import com.koreanair.external.dx.vo.FormOfIdentificationDetailListReply;
import com.koreanair.external.dx.vo.FrequentFlyerCardReply;
import com.koreanair.external.dx.vo.FrequentFlyerCardRequest;
import com.koreanair.external.dx.vo.FrequentFlyerCardRequestsListReply;
import com.koreanair.external.dx.vo.FrequentFlyerCardsListReply;
import com.koreanair.external.dx.vo.InsuranceItemsListReply;
import com.koreanair.external.dx.vo.Messages;
import com.koreanair.external.dx.vo.OrderPaymentConfirmRequest;
import com.koreanair.external.dx.vo.OrderPaymentRequest;
import com.koreanair.external.dx.vo.OrderPreviewsListReply;
import com.koreanair.external.dx.vo.OrderReply;
import com.koreanair.external.dx.vo.OrderSeatReply;
import com.koreanair.external.dx.vo.OrderSeatsReply;
import com.koreanair.external.dx.vo.OrderServiceReply;
import com.koreanair.external.dx.vo.OrderServicesReply;
import com.koreanair.external.dx.vo.OrdersListReply;
import com.koreanair.external.dx.vo.OtherServiceInformation;
import com.koreanair.external.dx.vo.OtherServiceInformationReply;
import com.koreanair.external.dx.vo.OtherServiceInformationsListReply;
import com.koreanair.external.dx.vo.PaymentRecordsReply;
import com.koreanair.external.dx.vo.PostOrderInsuranceRequest;
import com.koreanair.external.dx.vo.PostOrderRequest;
import com.koreanair.external.dx.vo.PostOrderSeatRequest;
import com.koreanair.external.dx.vo.PostOrderServiceRequest;
import com.koreanair.external.dx.vo.RegulatoryApisDetail;
import com.koreanair.external.dx.vo.RegulatoryApisDetailListReply;
import com.koreanair.external.dx.vo.Remark;
import com.koreanair.external.dx.vo.RemarkReply;
import com.koreanair.external.dx.vo.RemarksListReply;
import com.koreanair.external.dx.vo.SpecialKeyword;
import com.koreanair.external.dx.vo.SpecialKeywordReply;
import com.koreanair.external.dx.vo.SpecialKeywordsListReply;
import com.koreanair.external.dx.vo.SpecialServiceRequest;
import com.koreanair.external.dx.vo.SpecialServiceRequestReply;
import com.koreanair.external.dx.vo.SpecialServiceRequestsListReply;
import com.koreanair.external.dx.vo.TravelDocumentReply;
import com.koreanair.external.dx.vo.TravelDocumentsListReply;
import com.koreanair.external.dx.vo.TravelDocumentsRequest;
import com.koreanair.external.dx.vo.TravelerReply;
import com.koreanair.external.dx.vo.TravelersListReply;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




/**
 * Amadeus Digital Experience API
 *
 * <p># API information The document aims at describing the Amadeus Digital Experience API.  Through Digital API, an end user is able to search air offers and related services, add all necessary information to complete a booking, display a seatmap and select seats, add traveler preferences such as meal and finally finalize a booking (creation of an order). API also allows retrieving an existing order. Since the API is REST, operations are not flow related.  ## CRUD operations We do our best to have all our URLs be [RESTful](http://en.wikipedia.org/wiki/Representational_state_transfer). Every endpoint (URL) may support one of five different http verbs. GET requests fetch information about an object, POST requests create objects, PUT requests update objects and DELETE requests will delete objects. PATCH [JSON Merge Patch](https://tools.ietf.org/html/rfc7396) requests perform partial updates.  ## Structure ### The envelope Every response is contained by an envelope. That is, each response has a predictable set of keys with which you can expect to interact: ```json {     \"warnings\": [         ...     ],     \"data\": {         ...     },     \"dictionaries\": {         ...     },     \"errors\": [         ...     ] } ``` #### ERRORS Error messages corresponding to functional blocking issues encountered when processing an operation. When at least one message has a level 'error' nothing has been processed so no 'data' are returned. In this case the HTTP status become 200 for POST (instead of 201) and DELETE (instead of 204).  #### WARNINGS Warning messages corresponding to non blocking issues encountered when processing an operation.  #### DATA The data key is the meat of the response. It contains all information regarding the resource requested.  #### DICTIONARIES Each dictionary contains: - localized data : it's possible to request for a specific code (e.g. location code) the translation in the language code specified as query parameter. The translation applies as well to the related information: in case of location code, type of location (airport or city), corresponding city (for airport location), state, country, etc.) - dictionarized data : information used on different parts of the message can be defined once and referenced via an id. It that case, the id makes the connection between dictionary and data information Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get).  ### Example of request/response When triggering an API operation it is interesting to evaluate the response (or the data model corresponding to the input body in case of POST). ``` GET /carts/{cartId}/travelers/{travelerId} HTTP/1.1 Accept: application/json ```  Multiple errors can occur in response to a single request. The list of error messages is provided by the server: ```json HTTP/1.1 400 Bad Request Content-Type: application/json {   \"errors\": [     {       \"code\": \"04926\",       \"source\": { \"pointer\": \"/names/0/lastName\" },       \"title\": \"INVALID DATA RECEIVED\"       \"detail\": \"must match \\\"^[A-Za-zÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬-ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¿][A-Za-zÃƒÆ’Ã†â€™ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬-ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¿ -.]{1,69}$\\\"     },     {       \"code\": \"36986\",       \"source\": { \"pointer\": \"/0/dateOfBirth\" },       \"detail\": \"Date of birth '2018-07-01' should be in the past\",       \"title\": \"INVALID DATA RECEIVED\"     },   ] } ``` Note: example added for illustration only.  A few considerations on the error message structure: - The title communicates the type of problem encountered. - The code refers to an application-specific code representing the type of problem encountered. Code and title have a similar behaviour, since they communicate which is the problem type. However, it is suggested to rely on the code as a unique identifier. - The detail is used to provide information specific to this occurrence of the problem.  Message may use source to point to the top-level of the document (\"\"). The source member can also be used to indicate that the error originated from a problem with a URI query parameter (parameter field used instead of pointer in that case).  Standard [HTTP response status codes](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes) apply. As such they are not all mentioned below.  ## Top resources ### Cart The central resource is the `Cart` (shopping cart) used at shopping time to prepare a journey (shopping, booking and pricing) and later on to perform servicing on an already booked reservation. A `Cart` gather `AirOffer`s, `Traveler`s as well as `Service`s, `Seat`s, `FrequentFlyerCard`s and `Contact`s. It can be associated to zero, one or more users. At checkout time, an `Order` is created based on content selected from the `Cart`.  ### AirCalendar `Air Calendar` provides the best price per day based on input parameters.  ### AirBound `Air Bound` provides the bound-by-bound shopping proposal based on input parameters. ### AirOffer An `Air Offer` is the result of a shopping proposal. It is a collection of `OfferItem`s, each offer item containing flights.  ### Service The ``Service`` resource allows to access the list of free and/or chargeable services.  ### Seatmap ``Seatmap`` refers to display of the air seat map, allowing the end user to identify the seat to be booked for free or at a charge.  ### Order An ``Order`` corresponds to a reservation record (Amadeus PNRs). The order can contain flights, services and seats, as well as travel documents (E-Tickets and/or EMDs) in case the order has been paid and related tickets issued.  ### Payment Method A `Payment Method` refers to a payment method that be used to pay an order. The following payment methods are supported by DAPI: Payment cards, External  payment, Miles payment and Alternative Payment Method.  ## Secondary resources (main ones) ### Traveler A ``Traveler`` is an individual involved in the booking and taking part in a journey. ### Seat A ``Seat`` refers to the seat that the end user can select as part of the booking. ### Frequent Flyer ``Frequent Flyer`` contains frequent flyer cards either to accrue miles or redeem miles (only accrual supported initially). ### Contact ``Contact`` refers to emails, phone numbers and addresses. ### Travel Document A ``Travel Document`` refers to the tickets (E-Tickets and/or EMDs) issued for flights or services. ### Payment Record A `Payment Record` contains the details of the payment transaction for an order. It includes the payment method used for the order payment, as well additional information such as the approval code for a Credit Card payment. ## Limitations - Only air related content booking is supported. - Only one order is created at a time from the cart. - A cart can only contain one single airOffer.  ## Miscellaneous ### Temporary id (tid) A temporary id (``tid``) can be used to: - identify an object in the request of a POST operation when the id of the object is not known yet.  - identify an object in the response of a PUT operation when the id of the object is changing.  In all cases, a tid is only valid for the time of the transaction   ### Output filtering JSON output can be filtered using ``-fields`` and ``fields`` query parameters, followed by the fully qualified name of the attribute to filter/keep.  Optionally the ``keepRequiredFields`` boolean query parameter can be used to avoid filtering required fields out.  Examples: ``` GET /carts/{cartId}?-fields=data.travelers ``` will filter all travelers out of the response ``` GET /carts/{cartId}?fields=data.travelers.age ``` will keep only age of the travelers in response  Any questions, suggestions or feedbacks, thank you for contacting the DxAPI team  ### Traceability token For better traceability of requests, a traceability token can and should be added to every call to the API.  This token is composed of both a session part and a request part resulting in a unique ID for a single request.  This opens the door for: - Easy retrieval of information regarding that request. - Linking the request to other requests performed in the same user session.  This traceability token is materialized by an ``Ama-Client-Ref`` header to be sent in each and every request.  This header must be formatted as following: ``${SESSION_ID}:${REQUEST_ID}``.  Where: - ``SESSION_ID``: is a client-side generated token identifying the client-side user session matching following regular expression ``[a-zA-Z0-9-]{10,48}``. A recommended way is to implement it as an [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier) in [RFC 4122](https://tools.ietf.org/html/rfc4122) format.    - For example: ``123e4567-e89b-12d3-a456-426655440000``  - ``REQUEST_ID`` is a client-side request id within the client-side user session matching the ``[a-zA-Z0-9]{1,10}`` format.    - For example: ``1``, ``42``, ``5fa2``, ``Px2z5``, ...    - There is no notion of order between two ``REQUEST_ID``    - ``REQUEST_ID`` must be unique within a session.   Examples:  - Request ``2fc0`` within session ``123e4567-e89b-12d3-a456-426655440000`` traceability token:  ``Ama-Client-Ref: 123e4567-e89b-12d3-a456-426655440000:2fc0``     - Request ``7ba19e`` within session ``123e4567-e89b-12d3-a456-426655440000`` traceability token:  ``Ama-Client-Ref: 123e4567-e89b-12d3-a456-426655440000:7ba19e`` 
 *
 * API tests for OrderApi 
 */
public class OrderApiTest {


    private OrderApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("https://nodeA1.test.api.amadeus.com/v2", OrderApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    
    /**
     * Add some regulatory information in the Order (APIS data).
     *
     * Add Advance Passenger Information regulatory details (passport, visa, residence or destination addresses) in the Order. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addAPISToOrderTest() {
        String orderId = null;
        String travelerId = null;
        List<RegulatoryApisDetail> postAPISBody = null;
        String lang = null;
        String lastName = null;
        String firstName = null;
        //RegulatoryApisDetailListReply response = api.addAPISToOrder(orderId, travelerId, postAPISBody, lang, lastName, firstName);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Add Contacts in the order.
     *
     * Add Contact(s) in the order: Emails, Phones and/or Addresses. For more information on a specific type of contact, please see the page [Contacts documentation](http://e-travel.mkt.amadeus.net/dxapi/display/contacts.html#!/ContactType/get). Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addContactsToOrderTest() {
        String orderId = null;
        List<Contact> postContactsBody = null;
        String lang = null;
        String lastName = null;
        String firstName = null;
        //ContactsListReply response = api.addContactsToOrder(orderId, postContactsBody, lang, lastName, firstName);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Add FOID information in the order.
     *
     * Add some Form of identification details (regulatory document, frequent flyer or payment card) in the order for a list of travelers. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addFOIDToOrderTest() {
        String orderId = null;
        List<FormOfIdentificationDetail> postFOIDBody = null;
        String lang = null;
        String lastName = null;
        String firstName = null;
        //FormOfIdentificationDetailListReply response = api.addFOIDToOrder(orderId, postFOIDBody, lang, lastName, firstName);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Add Frequent flyer card in the order.
     *
     * Add frequent flyer card(s) in the order for miles accrual or servicing. A list of requests can be specified to either add new card or add a new usage to an existing card. To specify many usages for a same card, several requests needs to be created. For each card, several service requests (SSR) can be created in the order. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addFrequentFlyerCardsToOrderTest() {
        String orderId = null;
        List<FrequentFlyerCardRequest> postFrequentFlyerCardsBody = null;
        String lang = null;
        String lastName = null;
        String firstName = null;
        //FrequentFlyerCardRequestsListReply response = api.addFrequentFlyerCardsToOrder(orderId, postFrequentFlyerCardsBody, lang, lastName, firstName);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Add Insurances to the order.
     *
     * Add Insurance(s) (chosen from insurance availability) in the order. Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addInsurancesToOrderTest() {
        String orderId = null;
        PostOrderInsuranceRequest postInsurancesBody = null;
        String lastName = null;
        String lang = null;
        //InsuranceItemsListReply response = api.addInsurancesToOrder(orderId, postInsurancesBody, lastName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Add Other Service Information(s) in the order.
     *
     * Add Other Service Information(s) in the order. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addOtherServiceInformationsToOrderTest() {
        String orderId = null;
        List<OtherServiceInformation> postOtherServiceInformationsBody = null;
        String lang = null;
        String lastName = null;
        //OtherServiceInformationsListReply response = api.addOtherServiceInformationsToOrder(orderId, postOtherServiceInformationsBody, lang, lastName);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Add Remarks in the order.
     *
     * Add Remark(s) in the order: General Remarks, Corporate Remarks and/or Confidential Remarks. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addRemarksToOrderTest() {
        String orderId = null;
        List<Remark> postRemarksBody = null;
        String lang = null;
        String lastName = null;
        //RemarksListReply response = api.addRemarksToOrder(orderId, postRemarksBody, lang, lastName);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Add seats to an order
     *
     * Add a seat (from the seatmap) to the order. Both chargeable and free items can be added. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addSeatsToOrderTest() {
        String orderId = null;
        PostOrderSeatRequest postOrderSeatsBody = null;
        String lastName = null;
        String firstName = null;
        String lang = null;
        //OrderSeatsReply response = api.addSeatsToOrder(orderId, postOrderSeatsBody, lastName, firstName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Add services to an order
     *
     * Add services (chosen from the catalogue of services) to an order. Service dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addServicesToOrderTest() {
        String orderId = null;
        PostOrderServiceRequest postOrderServicesBody = null;
        String lastName = null;
        String firstName = null;
        String lang = null;
        //OrderServicesReply response = api.addServicesToOrder(orderId, postOrderServicesBody, lastName, firstName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Add Special Keyword(s) in the order.
     *
     * Add Special Keyword(s) in the order. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addSpecialKeywordsToOrderTest() {
        String orderId = null;
        List<SpecialKeyword> postSpecialKeywordsBody = null;
        String lang = null;
        String lastName = null;
        //SpecialKeywordsListReply response = api.addSpecialKeywordsToOrder(orderId, postSpecialKeywordsBody, lang, lastName);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Add Special Service Request(s) in the order.
     *
     * Add generic Special Service Request(s) (SSR) in the order. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addSpecialServiceRequestsToOrderTest() {
        String orderId = null;
        List<SpecialServiceRequest> postSpecialServiceRequestsBody = null;
        String lang = null;
        String lastName = null;
        //SpecialServiceRequestsListReply response = api.addSpecialServiceRequestsToOrder(orderId, postSpecialServiceRequestsBody, lang, lastName);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Cancel an order
     *
     * Cancel an unpaid order or an order with no associated travel documents. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelOrderTest() {
        String orderId = null;
        String lang = null;
        String lastName = null;
        String firstName = null;
        //api.cancelOrder(orderId, lang, lastName, firstName);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Update the order with the new flight selection from GET /search/alternative-offers
     *
     * Update the order with the new flight selection from GET /search/alternative-offers 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void confirmAlternativeOfferTest() {
        String orderId = null;
        AlternativeOfferConfirmationRequest alternativeOfferConfirmationRequest = null;
        //AlternativeOfferConfirmationReply response = api.confirmAlternativeOffer(orderId, alternativeOfferConfirmationRequest);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Performs the payment confirmation of the order after redirection.
     *
     * Controller used to perform the confirmation (after redirection) of the payment records associated to the specified order. This entry point performs several transactions: - Confirms and validates payment status based on the payment confirmation data sent in input. - Updates the payment records in the order - Create the travel documents (if configured to chain issuance after successful payment). The travel documents could also be created later by using POST purchase/orders/{orderId}/travel-documents. Payment Method is provided in the body of the request along with the payment confirmation data from the PSP.  Both AlternativePaymentMethod and PaymentCard enrolled for 3D Secure are supported. API will trigger the payment confirmation and travel documents issuance.  An error will be raised in the following cases: - The Order already contains confirmed payment records - The Order already contains travel documents 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void confirmPaymentRecordsTest() {
        String orderId = null;
        OrderPaymentConfirmRequest confirmPaymentRecordsBody = null;
        String lang = null;
        //PaymentRecordsReply response = api.confirmPaymentRecords(orderId, confirmPaymentRecordsBody, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Create an order
     *
     * The order is created from the cart content provided in input. Travel Documents can be issued. Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createOrderTest() {
        String cartId = null;
        String lang = null;
        PostOrderRequest createOrderBody = null;
        //OrdersListReply response = api.createOrder(cartId, lang, createOrderBody);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Performs the payment of the order.
     *
     * Performs the payment for the order. This entry point performs several transactions: - authorize the payment method for PaymentCard (based on configuration) - create the payment records in the order - return redirection URL (in case of AlternativePaymentMethod with redirection) - create the travel documents (if configured to chain issuance after successful payment). The travel documents could also be created later by using POST orders/{orderId}/travelDocuments. Payment Methods are provided in the HTTP body of the request. PaymentCard, ExternalPayment, MilesPayment and AlternativePaymentMethod are supported The API user can request: - the payment of an order: API will trigger the payment as well as issuance of all the order content. If there are any payment records (FP), travel documents or invalid order content, an error is raised. - the payment of specific seats and/or services in an order: the API user should in this case send the itemIds of seats/services that he wishes to pay. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPaymentRecordsTest() {
        String orderId = null;
        OrderPaymentRequest createPaymentRecordsBody = null;
        String lang = null;
        //PaymentRecordsReply response = api.createPaymentRecords(orderId, createPaymentRecordsBody, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Delete regulatory information from the order.
     *
     * Delete Advance Passenger Information regulatory details from the order for the given traveler.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAPISFromOrderTest() {
        String orderId = null;
        String travelerId = null;
        List<String> regulatoryApisDetailIds = null;
        String lastName = null;
        String firstName = null;
        String lang = null;
        //api.deleteAPISFromOrder(orderId, travelerId, regulatoryApisDetailIds, lastName, firstName, lang);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Delete a Contact from the order
     *
     * Delete a Contact from the order.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteContactFromOrderTest() {
        String orderId = null;
        String contactId = null;
        String lastName = null;
        String firstName = null;
        String lang = null;
        //api.deleteContactFromOrder(orderId, contactId, lastName, firstName, lang);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Delete Contacts from the order.
     *
     * Delete Contacts from the order.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteContactsFromOrderTest() {
        String orderId = null;
        List<String> contactIds = null;
        String lastName = null;
        String firstName = null;
        String lang = null;
        //api.deleteContactsFromOrder(orderId, contactIds, lastName, firstName, lang);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Delete the given FOID(s) from the order.
     *
     * Delete the form of Identification from the order.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFOIDFromOrderTest() {
        String orderId = null;
        List<String> formOfIdentificationDetailIds = null;
        String lastName = null;
        String firstName = null;
        String lang = null;
        //api.deleteFOIDFromOrder(orderId, formOfIdentificationDetailIds, lastName, firstName, lang);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Delete a frequent flyer card from the order
     *
     * Delete a frequent flyer card from the order. When deleting a card, all the service requests (miles accrual / servicing) associated to the card are removed.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFrequentFlyerCardFromOrderTest() {
        String orderId = null;
        String frequentFlyerCardId = null;
        String lastName = null;
        String firstName = null;
        String lang = null;
        //api.deleteFrequentFlyerCardFromOrder(orderId, frequentFlyerCardId, lastName, firstName, lang);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Delete Frequent flyer cards from the order.
     *
     * Delete Frequent flyer cards from the order. According the operation type, one or several service requests containing the card number can be deleted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFrequentFlyerCardsFromOrderTest() {
        String orderId = null;
        List<String> frequentFlyerCardsIds = null;
        String lastName = null;
        String firstName = null;
        String lang = null;
        //api.deleteFrequentFlyerCardsFromOrder(orderId, frequentFlyerCardsIds, lastName, firstName, lang);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Remove insurances from a an order
     *
     * Delete insurances from an order.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteInsurancesFromOrderTest() {
        String orderId = null;
        List<String> insuranceIds = null;
        String lastName = null;
        String lang = null;
        //api.deleteInsurancesFromOrder(orderId, insuranceIds, lastName, lang);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Delete an Other Service Information from the order
     *
     * Delete an Other Service Information from the order.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteOTherServiceInformationFromOrderTest() {
        String orderId = null;
        String otherServiceInformationId = null;
        String lastName = null;
        String lang = null;
        //api.deleteOTherServiceInformationFromOrder(orderId, otherServiceInformationId, lastName, lang);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Delete Other Service Information(s) from the order.
     *
     * Delete Other Service Information(s) from the order.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteOtherServiceInformationsFromOrderTest() {
        String orderId = null;
        List<String> otherServiceInformationIds = null;
        String lastName = null;
        String lang = null;
        //api.deleteOtherServiceInformationsFromOrder(orderId, otherServiceInformationIds, lastName, lang);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Delete payment records from Order.
     *
     * Performs the cancellation of all payment records in the Order. Payment records will be cancelled only in the following cases: - AlternativePaymentMethod with status \&quot;denied\&quot; or \&quot;error\&quot;. - PaymentCard enrolled for 3D Secure with no approval code. All payment records in the Order must comply with one of the cases above, otherwise, they will not be deleted and an error will be displayed. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePaymentRecordsTest() {
        String orderId = null;
        String lang = null;
        List<String> paymentRecordIds = null;
        //api.deletePaymentRecords(orderId, lang, paymentRecordIds);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Delete a Remark from the order
     *
     * Delete a Remark from the order.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteRemarkFromOrderTest() {
        String orderId = null;
        String remarkId = null;
        String lastName = null;
        String lang = null;
        //api.deleteRemarkFromOrder(orderId, remarkId, lastName, lang);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Delete Remarks from the order.
     *
     * Delete Remarks from the order.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteRemarksFromOrderTest() {
        String orderId = null;
        List<String> remarkIds = null;
        String lastName = null;
        String lang = null;
        //api.deleteRemarksFromOrder(orderId, remarkIds, lastName, lang);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Delete seat from an order
     *
     * Delete seat from an order.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSeatFromOrderTest() {
        String orderId = null;
        String seatId = null;
        String lastName = null;
        String firstName = null;
        String lang = null;
        //api.deleteSeatFromOrder(orderId, seatId, lastName, firstName, lang);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Remove seats from a an order
     *
     * Delete seats from an order.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSeatsFromOrderTest() {
        String orderId = null;
        List<String> seatIds = null;
        String lastName = null;
        String firstName = null;
        String lang = null;
        //api.deleteSeatsFromOrder(orderId, seatIds, lastName, firstName, lang);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Delete service from an order
     *
     * Delete service from an order.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteServiceFromOrderTest() {
        String orderId = null;
        String serviceId = null;
        String lastName = null;
        String firstName = null;
        String lang = null;
        //api.deleteServiceFromOrder(orderId, serviceId, lastName, firstName, lang);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Remove services from a an order
     *
     * Delete services from an order.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteServicesFromOrderTest() {
        String orderId = null;
        List<String> serviceIds = null;
        String lastName = null;
        String firstName = null;
        String lang = null;
        //api.deleteServicesFromOrder(orderId, serviceIds, lastName, firstName, lang);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Delete a Special Keyword from the order
     *
     * Delete a Special Keyword from the order.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSpecialKeywordFromOrderTest() {
        String orderId = null;
        String specialKeywordId = null;
        String lastName = null;
        String lang = null;
        //api.deleteSpecialKeywordFromOrder(orderId, specialKeywordId, lastName, lang);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Delete Special Keyword(s) from the order.
     *
     * Delete Special Keyword(s) from the order.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSpecialKeywordsFromOrderTest() {
        String orderId = null;
        List<String> specialKeywordIds = null;
        String lastName = null;
        String lang = null;
        //api.deleteSpecialKeywordsFromOrder(orderId, specialKeywordIds, lastName, lang);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Delete a Special Service Request from the order
     *
     * Delete a Special Service Request from the order.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSpecialServiceRequestFromOrderTest() {
        String orderId = null;
        String specialServiceRequestId = null;
        String lastName = null;
        String lang = null;
        //api.deleteSpecialServiceRequestFromOrder(orderId, specialServiceRequestId, lastName, lang);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Delete Special Service Request(s) from the order.
     *
     * Delete Special  Service Request(s) from the order.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSpecialServiceRequestsFromOrderTest() {
        String orderId = null;
        List<String> specialServiceRequestIds = null;
        String lastName = null;
        String lang = null;
        //api.deleteSpecialServiceRequestsFromOrder(orderId, specialServiceRequestIds, lastName, lang);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve the list of orders associated to a frequent flyer card or travel document number.
     *
     * Retrieve the list of orders associated to a frequent flyer card or a travel document number. Either &#39;frequentFlyerCardNumber&#39; + &#39;companyCode&#39; or &#39;travelDocumentId&#39; + &#39;lastName&#39; are required. Each order preview contains the basic information extracted from a corresponding order: please use the GET /purchase/orders/{orderId} entry point for a full view of the order. In case of group PNR, only the traveler matching the input criteria is returned. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getListOfOrderPreviewsTest() {
        String frequentFlyerCardNumber = null;
        String companyCode = null;
        String travelDocumentId = null;
        String lastName = null;
        String firstName = null;
        String lang = null;
        //OrderPreviewsListReply response = api.getListOfOrderPreviews(frequentFlyerCardNumber, companyCode, travelDocumentId, lastName, firstName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Create the travel documents for a given order
     *
     * Create the travel documents by issuing ETKT (Electronic ticket) and [EMD](https://en.wikipedia.org/wiki/Electronic_Miscellaneous_Document). Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueTravelDocumentsTest() {
        String orderId = null;
        String lang = null;
        TravelDocumentsRequest createTravelDocumentsBody = null;
        //TravelDocumentsListReply response = api.issueTravelDocuments(orderId, lang, createTravelDocumentsBody);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve the regulatory information for a specific traveler from an Order (APIS data)
     *
     * Retrieve Advance Passenger Information regulatory details for a specific traveler from an Order. The data can contain the passport, the visa and/or the residence/destination address information. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveAPISFromOrderTest() {
        String orderId = null;
        String travelerId = null;
        String lastName = null;
        String firstName = null;
        String lang = null;
        //RegulatoryApisDetailListReply response = api.retrieveAPISFromOrder(orderId, travelerId, lastName, firstName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve contact information
     *
     * Retrieve contact information from an order based on its id. There are three types of contact: phone, email and address. For more information on a specific type of contact, please see the page [Contacts documentation](http://e-travel.mkt.amadeus.net/dxapi/display/contacts.html#!/ContactType/get). Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveContactFromOrderTest() {
        String orderId = null;
        String contactId = null;
        String lastName = null;
        String firstName = null;
        String lang = null;
        //ContactReply response = api.retrieveContactFromOrder(orderId, contactId, lastName, firstName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve contacts information
     *
     * Retrieve a list of contacts for an order based on the order id. There are three types of contact: phone, email and address. For more information on a specific type of contact, please see the page [Contacts documentation](http://e-travel.mkt.amadeus.net/dxapi/display/contacts.html#!/ContactType/get). Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveContactsFromOrderTest() {
        String orderId = null;
        String lastName = null;
        String firstName = null;
        String lang = null;
        //ContactsListReply response = api.retrieveContactsFromOrder(orderId, lastName, firstName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve FOID data from an order
     *
     * Retrieve Form of Identification data from an order. The data can contain a regulatory document, a frequent flyer card or a payment card. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveFOIDFromOrderTest() {
        String orderId = null;
        String lastName = null;
        String firstName = null;
        String lang = null;
        //FormOfIdentificationDetailListReply response = api.retrieveFOIDFromOrder(orderId, lastName, firstName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve frequent flyer card information
     *
     * Retrieve frequent flyer card information from an order based on its id. Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveFrequentFlyerCardFromOrderTest() {
        String orderId = null;
        String frequentFlyerCardId = null;
        String lastName = null;
        String firstName = null;
        String lang = null;
        //FrequentFlyerCardReply response = api.retrieveFrequentFlyerCardFromOrder(orderId, frequentFlyerCardId, lastName, firstName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve frequent flyer cards information
     *
     * Retrieve a list of frequent flyer cards from an order based on the order id. Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveFrequentFlyerCardsFromOrderTest() {
        String orderId = null;
        String lastName = null;
        String firstName = null;
        String lang = null;
        //FrequentFlyerCardsListReply response = api.retrieveFrequentFlyerCardsFromOrder(orderId, lastName, firstName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieves an order
     *
     * Retrieves an order based on its id. Ex : /purchase/orders/AB23ED. Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveOrderTest() {
        String orderId = null;
        String lang = null;
        String lastName = null;
        String firstName = null;
        Boolean showOrderEligibilities = null;
        //OrderReply response = api.retrieveOrder(orderId, lang, lastName, firstName, showOrderEligibilities);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve an OSI element
     *
     * Retrieve an OSI element from an order based on its id. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveOtherServiceInformationFromOrderTest() {
        String orderId = null;
        String otherServiceInformationId = null;
        String lastName = null;
        String lang = null;
        //OtherServiceInformationReply response = api.retrieveOtherServiceInformationFromOrder(orderId, otherServiceInformationId, lastName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve OSI elements information
     *
     * Retrieve a list of OSI for an order based on the order id. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveOtherServiceInformationsFromOrderTest() {
        String orderId = null;
        String lastName = null;
        String lang = null;
        //OtherServiceInformationsListReply response = api.retrieveOtherServiceInformationsFromOrder(orderId, lastName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve a specific remark
     *
     * Retrieve a remark from an order based on its id. There are three types of remarks: general, corporate and confidential. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveRemarkFromOrderTest() {
        String orderId = null;
        String remarkId = null;
        String lastName = null;
        String lang = null;
        //RemarkReply response = api.retrieveRemarkFromOrder(orderId, remarkId, lastName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve remarks data
     *
     * Retrieve a list of remarks for an order based on the order id. There are three types of remarks: general, corporate and confidential. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveRemarksFromOrderTest() {
        String orderId = null;
        String lastName = null;
        String lang = null;
        //RemarksListReply response = api.retrieveRemarksFromOrder(orderId, lastName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve a specific seat from an order
     *
     * Retrieve a specific seat from an order. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveSeatFromOrderTest() {
        String orderId = null;
        String seatId = null;
        String lastName = null;
        String firstName = null;
        String lang = null;
        //OrderSeatReply response = api.retrieveSeatFromOrder(orderId, seatId, lastName, firstName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve all seats from an order
     *
     * Retrieve the list of seats from an order. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveSeatsFromOrderTest() {
        String orderId = null;
        String lastName = null;
        String firstName = null;
        String lang = null;
        //OrderSeatsReply response = api.retrieveSeatsFromOrder(orderId, lastName, firstName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve a specific service from an order
     *
     * Retrieve a service item from an order. Service dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveServiceFromOrderTest() {
        String orderId = null;
        String serviceId = null;
        String lastName = null;
        String firstName = null;
        String lang = null;
        //OrderServiceReply response = api.retrieveServiceFromOrder(orderId, serviceId, lastName, firstName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve all services from an order
     *
     * Retrieve a list of services from an order. Service dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveServicesFromOrderTest() {
        String orderId = null;
        String lastName = null;
        String firstName = null;
        String lang = null;
        //OrderServicesReply response = api.retrieveServicesFromOrder(orderId, lastName, firstName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve SK information
     *
     * Retrieve an SK information from an order based on its id. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveSpecialKeywordFromOrderTest() {
        String orderId = null;
        String specialKeywordId = null;
        String lastName = null;
        String lang = null;
        //SpecialKeywordReply response = api.retrieveSpecialKeywordFromOrder(orderId, specialKeywordId, lastName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve SK information
     *
     * Retrieve a list of contacts for an order based on the order id. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveSpecialKeywordsFromOrderTest() {
        String orderId = null;
        String lastName = null;
        String lang = null;
        //SpecialKeywordsListReply response = api.retrieveSpecialKeywordsFromOrder(orderId, lastName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve SSR information
     *
     * Retrieve an SSR information from an order based on its id. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveSpecialServiceRequestFromOrderTest() {
        String orderId = null;
        String specialServiceRequestId = null;
        String lastName = null;
        String lang = null;
        //SpecialServiceRequestReply response = api.retrieveSpecialServiceRequestFromOrder(orderId, specialServiceRequestId, lastName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve all specialServiceRequests from an order
     *
     * Retrieve all specialServiceRequests from an order based on order id. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveSpecialServiceRequestsFromOrderTest() {
        String orderId = null;
        String lang = null;
        String lastName = null;
        //SpecialServiceRequestsListReply response = api.retrieveSpecialServiceRequestsFromOrder(orderId, lang, lastName);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve a specific travel document for a given order
     *
     * Retrieve a travel documents associated to an order based on the order id and document id. Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveTravelDocumentTest() {
        String orderId = null;
        String travelDocumentId = null;
        String lastName = null;
        String firstName = null;
        String lang = null;
        //TravelDocumentReply response = api.retrieveTravelDocument(orderId, travelDocumentId, lastName, firstName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve all travel documents for a given order
     *
     * Retrieve travel documents associated to an order based on the order id. Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveTravelDocumentsTest() {
        String orderId = null;
        String lastName = null;
        String firstName = null;
        String lang = null;
        //TravelDocumentsListReply response = api.retrieveTravelDocuments(orderId, lastName, firstName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve all travelers from an order
     *
     * Retrieve all travelers from an order based on order id. Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveTravelersTest() {
        String orderId = null;
        String lang = null;
        String lastName = null;
        String firstName = null;
        //TravelersListReply response = api.retrieveTravelers(orderId, lang, lastName, firstName);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve a specific traveler from an order
     *
     * Retrieve a traveler from an order based on its id. Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveTravelersFromOrderTest() {
        String orderId = null;
        String travelerId = null;
        String lastName = null;
        String firstName = null;
        String lang = null;
        //TravelerReply response = api.retrieveTravelersFromOrder(orderId, travelerId, lastName, firstName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Update a Contact in Order
     *
     * Update a Contact in the order. This operation allows a partial update of a contact. Limitations for any tpe of contact: - The contact type, category and purpose cannot be changed e.g. modify an email into a phone, or a phone business to a phone home. Limitations for Phones: - Only the countryPhoneExtension, the areaCode and the number can be modified. Limitations for Addresses: - The format of an address (structured or not) can not be changed. By updating an address content, the format is kept. All information that needs to be kept needs to be provided in input. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateContactInOrderTest() {
        String orderId = null;
        String contactId = null;
        Contact patchContactBody = null;
        String lastName = null;
        String firstName = null;
        String lang = null;
        //ContactReply response = api.updateContactInOrder(orderId, contactId, patchContactBody, lastName, firstName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Update Contacts information in an Order
     *
     * Update contacts in the order. This operation allows a partial update of some elements of the list. Limitations for any type of contact: - The contact type, category and purpose cannot be changed e.g. modify an email into a phone, or a phone business to a phone home. Limitations for Phones: - Only the countryPhoneExtension, the areaCode and the number can be modified. Limitations for Addresses: - The PNR format of an address in the PNR (structured or freetext address) is kept by updating any field of the address. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateContactsInOrderTest() {
        String orderId = null;
        List<Contact> patchContactsBody = null;
        String lastName = null;
        String firstName = null;
        String lang = null;
        //ContactsListReply response = api.updateContactsInOrder(orderId, patchContactsBody, lastName, firstName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Update an Other Service Information element (OSI)
     *
     * Update an Other Service Information in the order.  Limitations: - Airline code and passenger association cannot be changed. Only the freetext of the Other Service Information can be updated. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateOtherServiceInformationInOrderTest() {
        String orderId = null;
        String otherServiceInformationId = null;
        OtherServiceInformation patchOtherServiceInformationBody = null;
        String lastName = null;
        String lang = null;
        //OtherServiceInformationReply response = api.updateOtherServiceInformationInOrder(orderId, otherServiceInformationId, patchOtherServiceInformationBody, lastName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Update OSI in an Order
     *
     * Update Other Service Informations in the order. This operation allows a partial update of some elements of the list. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateOtherServiceInformationsInOrderTest() {
        String orderId = null;
        List<OtherServiceInformation> patchOtherServiceInformationsBody = null;
        String lastName = null;
        String lang = null;
        //OtherServiceInformationsListReply response = api.updateOtherServiceInformationsInOrder(orderId, patchOtherServiceInformationsBody, lastName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Update a Remark
     *
     * Update a Remark in the order.  Limitations for all Remark type: - The remark type cannot be changed e.g. modify a GeneralRemark into a ConfidentialRemark.  Limitations for GeneralRemark: - The category cannot be changed - A GeneralRemark with passenger association cannot be updated to a GeneralRemark without passenger asssociation. It is however possible to update the passenger association with new values. - A GeneralRemarl with segment association cannot be updated to a GeneralRemark without segment association. It is however possible to update the segment association with new values.  Limitations for ConfidentialRemark: - The security options cannot be changed - A ConfidentialRemark with passenger association cannot be updated to a ConfidentialRemark without passenger asssociation. It is however possible to update the passenger association with new values.  Limitations for CorporateRemark: - A CorporateRemark with passenger association cannot be updated to a CorporateRemark without passenger asssociation. It is however possible to update the passenger association with new values. - A CorporateRemark with segment association cannot be updated to a CorporateRemark without segment association. It is however possible to update the segment association with new values. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRemarkInOrderTest() {
        String orderId = null;
        String remarkId = null;
        Remark patchRemarkBody = null;
        String lastName = null;
        String lang = null;
        //RemarkReply response = api.updateRemarkInOrder(orderId, remarkId, patchRemarkBody, lastName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Update remarks in an Order
     *
     * Update remarks in the order. This operation allows a partial update of some elements of the list. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRemarksInOrderTest() {
        String orderId = null;
        List<Remark> patchRemarksBody = null;
        String lastName = null;
        String lang = null;
        //RemarksListReply response = api.updateRemarksInOrder(orderId, patchRemarksBody, lastName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
}
