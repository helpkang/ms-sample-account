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

import com.koreanair.external.dx.vo.AcceptanceReply;
import com.koreanair.external.dx.vo.BoardingPassDeliveryInput;
import com.koreanair.external.dx.vo.BoardingPassesReply;
import com.koreanair.external.dx.vo.Contact;
import com.koreanair.external.dx.vo.ContactReply;
import com.koreanair.external.dx.vo.ContactsListReply;
import com.koreanair.external.dx.vo.FrequentFlyerCard;
import com.koreanair.external.dx.vo.FrequentFlyerCardReply;
import com.koreanair.external.dx.vo.FrequentFlyerCardsListReply;
import com.koreanair.external.dx.vo.JourneyBaggageRequest;
import com.koreanair.external.dx.vo.JourneyBaggagesReply;
import com.koreanair.external.dx.vo.JourneyElementReply;
import com.koreanair.external.dx.vo.JourneyElementSeatReply;
import com.koreanair.external.dx.vo.JourneyElementsListReply;
import com.koreanair.external.dx.vo.JourneyPaymentAuthorizationReply;
import com.koreanair.external.dx.vo.JourneyPaymentAuthorizationRequest;
import com.koreanair.external.dx.vo.JourneyPaymentConfirmationRequest;
import com.koreanair.external.dx.vo.JourneyPaymentRequest;
import com.koreanair.external.dx.vo.JourneyReply;
import com.koreanair.external.dx.vo.JourneyRequest;
import com.koreanair.external.dx.vo.JourneyTravelerPostRequest;
import com.koreanair.external.dx.vo.JourneyUnpaidItemsReply;
import com.koreanair.external.dx.vo.JourneysListReply;
import com.koreanair.external.dx.vo.Messages;
import com.koreanair.external.dx.vo.PaymentRecordsReply;
import com.koreanair.external.dx.vo.RegulatoryDetailsAddRequest;
import com.koreanair.external.dx.vo.RegulatoryDetailsListReply;
import com.koreanair.external.dx.vo.RegulatoryDetailsReply;
import com.koreanair.external.dx.vo.ServiceItemRequest;
import com.koreanair.external.dx.vo.ServiceReply;
import com.koreanair.external.dx.vo.ServicesReply;
import com.koreanair.external.dx.vo.UpdateJourneyElementRequest;
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
 * API tests for CheckInApi 
 */
public class CheckInApiTest {


    private CheckInApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("https://nodeA1.test.api.amadeus.com/v2", CheckInApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    
    /**
     * Add Contacts in the journey.
     *
     * Add Contact(s) in the journey: Emails and/or Phones. For more information on a specific type of contact, please see the page [Contacts documentation](http://e-travel.mkt.amadeus.net/dxapi/display/contacts.html#!/ContactType/get). Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addContactsToJourneyTest() {
        String journeyId = null;
        List<Contact> postContactsBody = null;
        //ContactsListReply response = api.addContactsToJourney(journeyId, postContactsBody);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Add a traveler&#39;s frequent flyer card to the journey
     *
     * Add a traveler&#39;s frequent flyer card to the journey for miles accrual. The traveler ID is taken from the Frequent Flyer Card that is given
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addFrequentFlyerCardToJourneyTest() {
        String journeyId = null;
        FrequentFlyerCard frequentFlyerCard = null;
        //FrequentFlyerCardReply response = api.addFrequentFlyerCardToJourney(journeyId, frequentFlyerCard);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Add a frequent flyer card for the journey element (traveler on a flight)
     *
     * Add frequent flyer card in the journey element (traveler on a flight) for miles accrual
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addFrequentFlyerCardToJourneyElementTest() {
        String journeyElementId = null;
        FrequentFlyerCard frequentFlyerCard = null;
        //FrequentFlyerCardReply response = api.addFrequentFlyerCardToJourneyElement(journeyElementId, frequentFlyerCard);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Add baggages for several passengers in the journey
     *
     * Add baggages for several passengers in the journey. All the requests will be cumulated, meaning that if we send for instance (traveler1, 2 baggages), (travaler1, 1 baggage, hunting trophy) and (traveler1, 3 baggages), as a result traveler1 will have a total of 5 regular baggages and 1 special baggage of type \&quot;hunting trophy\&quot;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addJourneyBagsTest() {
        String journeyId = null;
        List<JourneyBaggageRequest> postBaggagesBody = null;
        //JourneyBaggagesReply response = api.addJourneyBags(journeyId, postBaggagesBody);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Add regulatory details on a journey
     *
     * Add one or multiple regulatory details that are required for the travelers on this journey 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addJourneyRegulatoryDetailsTest() {
        String journeyId = null;
        List<RegulatoryDetailsAddRequest> addRegulatoryDetailsRequest = null;
        //RegulatoryDetailsListReply response = api.addJourneyRegulatoryDetails(journeyId, addRegulatoryDetailsRequest);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Add services to a journey
     *
     * Add one or multiple services from the catalogue of services to the journey. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addJourneyServicesTest() {
        String journeyId = null;
        List<ServiceItemRequest> postServicesBody = null;
        //ServicesReply response = api.addJourneyServices(journeyId, postServicesBody);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Add regulatory details
     *
     * Add one or multiple regulatory details that are required for the traveler on this journey 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addRegulatoryDetailsTest() {
        String journeyId = null;
        String travelerId = null;
        RegulatoryDetailsAddRequest addRegulatoryDetailsRequest = null;
        //RegulatoryDetailsReply response = api.addRegulatoryDetails(journeyId, travelerId, addRegulatoryDetailsRequest);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Add a new traveler to check-in
     *
     * Modify a journey integrating a traveler retrieving the necessary information from: - an existing journey. - a confirmed booking (record locator, e-ticket number, Frequent Flyer card). Departure date, Origin location code and Last name are information are not mandatory and used only to secure the access. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addTravelerToJourneyTest() {
        String journeyId = null;
        JourneyTravelerPostRequest journeyRequest = null;
        //JourneyReply response = api.addTravelerToJourney(journeyId, journeyRequest);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Set, confirm or update seat assignment for the passenger and flight combination
     *
     * Set, confirm or update seat assignment for the passenger and flight combination.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void assignSeatToJourneyElementTest() {
        String journeyElementId = null;
        String seatNumber = null;
        //JourneyElementSeatReply response = api.assignSeatToJourneyElement(journeyElementId, seatNumber);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Authorize the payment record
     *
     * Authorize a payment record, to be called after creating it, and before confirming it. Payment in Self-Service Check-In is a three step process, leveraging Amadeus Payment Platform First, a payment record must be created for the journey.   This payment record will contain only an ID and a Payment Transaction   The ID is used to correlate the three steps of the process   The Payment Transaction will contain only a Payment Request   The Payment Request will contain a Payment Method and an Amount   If the amount is equal to 0 (possible for a free change, or a redemption credit purchase for example), no further process is necessary   The Payment Method will be of type AlternativePaymentMethod   The AlternativePaymentMethod will contain only a dedicated name \&quot;SSCI_APP\&quot; and a status Next, if the amount is not 0 the payment must be authorized and confirmed   Authorization is done by calling the authorization controller on the relevant payment record, passing the method of payment data   (This authorization step can be reaplced with an integrated external payment system, e.g. prebuilt Amadeus Payment Pages) Finally, after authorization the payment must be confirmed   This is performed by calling a confirmation controller on the relevant payment record, passing the email address to be used for the payment receipt 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void authorizeJourneyPaymentRecordTest() {
        String journeyId = null;
        String paymentRecordId = null;
        JourneyPaymentAuthorizationRequest journeyPaymentAuthorizationInput = null;
        //JourneyPaymentAuthorizationReply response = api.authorizeJourneyPaymentRecord(journeyId, paymentRecordId, journeyPaymentAuthorizationInput);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Confirm the payment record
     *
     * Confirm a payment record, to be called after having authorized it. Payment in Self-Service Check-In is a three step process, leveraging Amadeus Payment Platform First, a payment record must be created for the journey.   This payment record will contain only an ID and a Payment Transaction   The ID is used to correlate the three steps of the process   The Payment Transaction will contain only a Payment Request   The Payment Request will contain a Payment Method and an Amount   If the amount is equal to 0 (possible for a free change, or a redemption credit purchase for example), no further process is necessary   The Payment Method will be of type AlternativePaymentMethod   The AlternativePaymentMethod will contain only a dedicated name \&quot;SSCI_APP\&quot; and a status Next, if the amount is not 0 the payment must be authorized and confirmed   Authorization is done by calling the authorization controller on the relevant payment record, passing the method of payment data   (This authorization step can be reaplced with an integrated external payment system, e.g. prebuilt Amadeus Payment Pages) Finally, after authorization the payment must be confirmed   This is performed by calling a confirmation controller on the relevant payment record, passing the email address to be used for the payment receipt 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void confirmJourneyPaymentRecordTest() {
        String journeyId = null;
        String paymentRecordId = null;
        JourneyPaymentConfirmationRequest journeyPaymentConfirmationInput = null;
        //PaymentRecordsReply response = api.confirmJourneyPaymentRecord(journeyId, paymentRecordId, journeyPaymentConfirmationInput);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Create a new payment record for this journey
     *
     * Create a new payment record for this journey. Payment can be requested for various processes, e.g. Unpaid ancillaries, Upgrade, Flight reshopping... Payment in Self-Service Check-In is a three step process, leveraging Amadeus Payment Platform First, a payment record must be created for the journey.   This payment record will contain only an ID and a Payment Transaction   The ID is used to correlate the three steps of the process   The Payment Transaction will contain only a Payment Request   The Payment Request will contain a Payment Method and an Amount   If the amount is equal to 0 (possible for a free change, or a redemption credit purchase for example), no further process is necessary   The Payment Method will be of type AlternativePaymentMethod   The AlternativePaymentMethod will contain only a dedicated name \&quot;SSCI_APP\&quot; and a status Next, if the amount is not 0 the payment must be authorized and confirmed   Authorization is done by calling the authorization controller on the relevant payment record, passing the method of payment data   (This authorization step can be reaplced with an integrated external payment system, e.g. prebuilt Amadeus Payment Pages) Finally, after authorization the payment must be confirmed   This is performed by calling a confirmation controller on the relevant payment record, passing the email address to be used for the payment receipt 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createJourneyPaymentRecordTest() {
        String journeyId = null;
        JourneyPaymentRequest journeyPaymentInput = null;
        //PaymentRecordsReply response = api.createJourneyPaymentRecord(journeyId, journeyPaymentInput);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Remove acceptance of a journey
     *
     * Remove acceptance of a journey, i.e. undo the check-in.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAcceptanceFromJourneyTest() {
        String journeyId = null;
        //api.deleteAcceptanceFromJourney(journeyId);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Undo the check-in of a journey element
     *
     * Delete the acceptance (i.e. undo the check-in) of a traveler on a flight
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAcceptanceFromJourneyElementTest() {
        String journeyElementId = null;
        //api.deleteAcceptanceFromJourneyElement(journeyElementId);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Remove a contact from a journey
     *
     * Remove a contact from a journey.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteJourneyContactTest() {
        String journeyId = null;
        String contactId = null;
        //api.deleteJourneyContact(journeyId, contactId);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Remove contacts from a journey
     *
     * Delete contacts from a journey.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteJourneyContactsTest() {
        String journeyId = null;
        List<String> contactIds = null;
        //api.deleteJourneyContacts(journeyId, contactIds);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Remove a service from a journey
     *
     * Delete a service from a journey.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteJourneyServiceTest() {
        String journeyId = null;
        String serviceId = null;
        //api.deleteJourneyService(journeyId, serviceId);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Remove services from a journey
     *
     * Delete services from a journey.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteJourneyServicesTest() {
        String journeyId = null;
        List<String> serviceIds = null;
        //api.deleteJourneyServices(journeyId, serviceIds);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Generate boarding passes
     *
     * Generate the boarding passes for all the passengers on all flights of the journey selected. According to the delivery method chosen the response could provide the document or be empty in case of it is an indirect delivery (i.e. email, sms). A list of traveler-flight-infos can be provided to generate the boarding passes only for those. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void generateBoardingPassesTest() {
        BoardingPassDeliveryInput deliveryInstructions = null;
        //BoardingPassesReply response = api.generateBoardingPasses(deliveryInstructions);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Get provided and required regulatory details for the journey
     *
     * Retrieve the regulatory details that were previously provided for all the travelers inside the journey. Also retrieve the regulatory details that are required (or still missing) to enable the check-in and fulfill the regulatory requirement of the travel. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJourneyRegulatoryDetailsTest() {
        String journeyId = null;
        //RegulatoryDetailsListReply response = api.getJourneyRegulatoryDetails(journeyId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve a service from a journey
     *
     * Retrieve a service currently present in the journey.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJourneyServiceTest() {
        String journeyId = null;
        String serviceId = null;
        //ServiceReply response = api.getJourneyService(journeyId, serviceId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Get services inside the journey
     *
     * Retrieve the services booked by the travelers of the journey 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJourneyServicesTest() {
        String journeyId = null;
        //ServicesReply response = api.getJourneyServices(journeyId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve unpaid items linked to a journey
     *
     * Retrieve a list of unpaid items (ancillary services, bags, seats) linked to the journey.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJourneyUnpaidItemsTest() {
        String journeyId = null;
        //JourneyUnpaidItemsReply response = api.getJourneyUnpaidItems(journeyId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Get provided and required regulatory details
     *
     * Retrieve the regulatory details that were previously provided for the traveler. Also retrieve the regulatory details that are required (or still missing) to enable the check-in and fulfill the regulatory requirement of the travel. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRegulatoryDetailsTest() {
        String journeyId = null;
        String travelerId = null;
        //RegulatoryDetailsReply response = api.getRegulatoryDetails(journeyId, travelerId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Remove baggages from a journey
     *
     * Remove one or more baggages from the a journey
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeBaggagesFromJourneyTest() {
        String journeyId = null;
        List<String> baggageIds = null;
        //api.removeBaggagesFromJourney(journeyId, baggageIds);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Remove traveler from a journey
     *
     * Remove traveler from a journey, i.e. ignore this traveler during the check-in operation
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeTravelersFromJourneyTest() {
        String journeyId = null;
        List<String> travelerIds = null;
        //api.removeTravelersFromJourney(journeyId, travelerIds);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Request acceptance of a journey
     *
     * Requesting the acceptance of journey will check-in all the travelers on every flight associated to the journey. The acceptance is performed only if the travelers are allowed to check-in. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void requestAcceptanceOfJourneyTest() {
        String journeyId = null;
        Boolean areSecurityQuestionsAnswered = null;
        //AcceptanceReply response = api.requestAcceptanceOfJourney(journeyId, areSecurityQuestionsAnswered);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Check-in a traveler on flight
     *
     * Perform the check-in of a traveler on a flight (if the traveler is allowed to take it).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void requestAcceptanceOfJourneyElementTest() {
        String journeyElementId = null;
        Boolean areSecurityQuestionsAnswered = null;
        //AcceptanceReply response = api.requestAcceptanceOfJourneyElement(journeyElementId, areSecurityQuestionsAnswered);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Get acceptance (check-in) status of the a journey
     *
     * Get the acceptance status of a journey: either all traveler on flight are accepted, or none, or partially.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveAcceptanceFromJourneyTest() {
        String journeyId = null;
        //AcceptanceReply response = api.retrieveAcceptanceFromJourney(journeyId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Get acceptance (check-in) status of a journey element
     *
     * Get the acceptance status of a journey element: the traveler is checked in (or not) on the flight
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveAcceptanceFromJourneyElementTest() {
        String journeyElementId = null;
        //AcceptanceReply response = api.retrieveAcceptanceFromJourneyElement(journeyElementId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve contact information
     *
     * Retrieve contact information from a journey based on its id. There are two types of contact supported: phone, email. For more information on a specific type of contact, please see the page [Contacts documentation](http://e-travel.mkt.amadeus.net/dxapi/display/contacts.html#!/ContactType/get). Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveContactFromJourneyTest() {
        String journeyId = null;
        String contactId = null;
        //ContactReply response = api.retrieveContactFromJourney(journeyId, contactId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve contacts information
     *
     * Retrieve a list of contacts for a journey. There are two types of contact supported: phone, email. For more information on a specific type of contact, please see the page [Contacts documentation](http://e-travel.mkt.amadeus.net/dxapi/display/contacts.html#!/ContactType/get). Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveContactsFromJourneyTest() {
        String journeyId = null;
        //ContactsListReply response = api.retrieveContactsFromJourney(journeyId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve frequent flyer card information
     *
     * Retrieve frequent flyer card information associated to the journey element
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveFrequentFlyerCardFromJourneyElementTest() {
        String journeyElementId = null;
        //FrequentFlyerCardsListReply response = api.retrieveFrequentFlyerCardFromJourneyElement(journeyElementId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve journey
     *
     * Retrieve a journey corresponding to the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveJourneyTest() {
        String journeyId = null;
        //JourneyReply response = api.retrieveJourney(journeyId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve the list of baggages registered on this journey
     *
     * Retrieve the list of baggages registered on this journey
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveJourneyBaggagesTest() {
        String journeyId = null;
        //JourneyBaggagesReply response = api.retrieveJourneyBaggages(journeyId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve information about traveler on flight
     *
     * Retrieve a specific journey element (traveler on a flight)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveJourneyElementTest() {
        String journeyElementId = null;
        //JourneyElementReply response = api.retrieveJourneyElement(journeyElementId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve information about travelers on flights
     *
     * Retrieve all the journey element (traveler on a flight)rmation corresponding to a defined check-in journey. A JourneyElement stores the information related to the experience of the traveler getting on a plane (seat association, requested services, etc.). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveJourneyElementsTest() {
        String journeyId = null;
        //JourneyElementsListReply response = api.retrieveJourneyElements(journeyId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve journeys
     *
     * Retrieve the list of journeys available for check-in corresponding to a confirmed booking. A journey will contain the information about flights and travelers associated to the booking. In order to check-in the entire journey in one shot the operation to perform is POST /checkin/journey/{journeyId}/acceptance. It is possible to retrieve or modify the information corresponding to any traveler on the flights associated to the journey, choosing among the available operations of the resource JourneyElement. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveJourneysTest() {
        JourneyRequest postJourneyBody = null;
        //JourneysListReply response = api.retrieveJourneys(postJourneyBody);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Update the information about the traveler on the flight
     *
     * Update the traveler on the flight information.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateJourneyElementTest() {
        String journeyElementId = null;
        UpdateJourneyElementRequest updateJourneyElementRequest = null;
        //JourneyElementReply response = api.updateJourneyElement(journeyElementId, updateJourneyElementRequest);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Update the voluntary denied boarding status of the journey
     *
     * Update the voluntary denied boarding status of the journey. In case of overbooking, are the traveller(s) on this journey volunteer(s) to surrender their place in exchange of compensation?
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateVoluntaryDeniedBoardingOnJourneyTest() {
        String journeyId = null;
        Boolean desiredVoluntaryDeniedBoardingStatus = null;
        //AcceptanceReply response = api.updateVoluntaryDeniedBoardingOnJourney(journeyId, desiredVoluntaryDeniedBoardingStatus);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Update the voluntary denied boarding status of the journey element
     *
     * Update the voluntary denied boarding status of the journey element. In case of overbooking, is the traveller(s) on this flight volunteer to surrender their place in exchange of compensation?
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateVoluntaryDeniedBoardingOnJourneyElementTest() {
        String journeyElementId = null;
        Boolean desiredVoluntaryDeniedBoardingStatus = null;
        //AcceptanceReply response = api.updateVoluntaryDeniedBoardingOnJourneyElement(journeyElementId, desiredVoluntaryDeniedBoardingStatus);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
}
