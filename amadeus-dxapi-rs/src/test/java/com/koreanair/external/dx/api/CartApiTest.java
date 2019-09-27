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

import com.koreanair.external.dx.vo.AirOfferReply;
import com.koreanair.external.dx.vo.AirOfferSelectionRequest;
import com.koreanair.external.dx.vo.AirOffersInCartReply;
import com.koreanair.external.dx.vo.CartReply;
import com.koreanair.external.dx.vo.CartRequest;
import com.koreanair.external.dx.vo.CloneCartRequest;
import com.koreanair.external.dx.vo.Contact;
import com.koreanair.external.dx.vo.ContactReply;
import com.koreanair.external.dx.vo.ContactsListReply;
import com.koreanair.external.dx.vo.Extension;
import com.koreanair.external.dx.vo.ExtensionListReply;
import com.koreanair.external.dx.vo.ExtensionReply;
import com.koreanair.external.dx.vo.FormOfIdentificationDetail;
import com.koreanair.external.dx.vo.FormOfIdentificationDetailListReply;
import com.koreanair.external.dx.vo.FrequentFlyerCard;
import com.koreanair.external.dx.vo.FrequentFlyerCardReply;
import com.koreanair.external.dx.vo.FrequentFlyerCardsListReply;
import com.koreanair.external.dx.vo.HotelOffersListReply;
import com.koreanair.external.dx.vo.HotelOffersSelectionRequest;
import com.koreanair.external.dx.vo.Messages;
import com.koreanair.external.dx.vo.RegulatoryApisDetail;
import com.koreanair.external.dx.vo.RegulatoryApisDetailListReply;
import com.koreanair.external.dx.vo.SeatItemRequest;
import com.koreanair.external.dx.vo.SeatReply;
import com.koreanair.external.dx.vo.SeatsReply;
import com.koreanair.external.dx.vo.ServiceItemRequest;
import com.koreanair.external.dx.vo.ServiceReply;
import com.koreanair.external.dx.vo.ServicesReply;
import com.koreanair.external.dx.vo.Traveler;
import com.koreanair.external.dx.vo.TravelerReply;
import com.koreanair.external.dx.vo.TravelersListReply;
import com.koreanair.external.dx.vo.UpdateCartRequest;
import com.koreanair.external.dx.vo.UpdateSeatItemRequest;
import com.koreanair.external.dx.vo.UpdateSeatItemsRequest;
import com.koreanair.external.dx.vo.UpdateServiceItemRequest;
import com.koreanair.external.dx.vo.UpdateServiceItemsRequest;
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
 * API tests for CartApi 
 */
public class CartApiTest {


    private CartApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("https://nodeA1.test.api.amadeus.com/v2", CartApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    
    /**
     * Add regulatory information in the Cart.
     *
     * Add some Advance Passenger Information details (regulatory documents or addresses) in the Cart for a given traveler. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addAPISsToCartTest() {
        String cartId = null;
        String travelerId = null;
        List<RegulatoryApisDetail> postAPISBody = null;
        String lang = null;
        //RegulatoryApisDetailListReply response = api.addAPISsToCart(cartId, travelerId, postAPISBody, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Add an air offer to the cart
     *
     * Add an airOffer to a given cart. An offer can be added in the cart either from an airOffer ID or from a list of bound IDs (inputs are mutually exclusive). In that case an offer containing these bounds is created. When adding an air offer in the cart, a list of traveler sub-resources are created automatically. The created sub-resources contain only the assigned id and the passenger type code (PTC) corresponding to the ones selected when performing the air offer search. Example: if the air offer has been computed for 1 adult and 2 children, then 1 adult and 2 children travelers will be created accordingly. In case the cart contains already travelers, only the missing travelers will be created and a matching based on the PTC is done to associate these travelers to the offer. Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addAirOfferToCartTest() {
        String cartId = null;
        String lastName = null;
        String lang = null;
        AirOfferSelectionRequest postAirOfferBody = null;
        //AirOffersInCartReply response = api.addAirOfferToCart(cartId, lastName, lang, postAirOfferBody);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Add FOID information in the cart.
     *
     * Add some Form of identification details (regulatory document or frequent flyer) in the cart for a list of travelers. The payment card is currently not available to be stored in the cart. For more information on the Form of identification details, please see the page [FOID documentation](http://e-travel.mkt.amadeus.net/dxapi/display/foid.html#!/IdentificationType/get). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addFOIDsToCartTest() {
        String cartId = null;
        List<FormOfIdentificationDetail> postFOIDsBody = null;
        String lang = null;
        //FormOfIdentificationDetailListReply response = api.addFOIDsToCart(cartId, postFOIDsBody, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Add one or several hotel offers to the cart
     *
     * Add one or several hotel offers to a given cart. The list of added HotelOffers is returned. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addHotelOffersToCartTest() {
        String cartId = null;
        List<HotelOffersSelectionRequest> postHotelOfferBody = null;
        String lang = null;
        //HotelOffersListReply response = api.addHotelOffersToCart(cartId, postHotelOfferBody, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Add seats to a cart
     *
     * Add seats (from the seatmap) to the cart. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addSeatsToCartTest() {
        String cartId = null;
        List<SeatItemRequest> postSeatsBody = null;
        String lastName = null;
        String lang = null;
        //SeatsReply response = api.addSeatsToCart(cartId, postSeatsBody, lastName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Add services to a cart
     *
     * Add a service (chosen from the catalogue of services) to the cart. Service dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addServicesToCartTest() {
        String cartId = null;
        List<ServiceItemRequest> postServicesBody = null;
        String lastName = null;
        String lang = null;
        //ServicesReply response = api.addServicesToCart(cartId, postServicesBody, lastName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Create a new cart from existing order
     *
     * Create copy of a cart from a given order
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cloneCartTest() {
        CloneCartRequest postCloneCartBody = null;
        String lastName = null;
        //CartReply response = api.cloneCart(postCloneCartBody, lastName);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Create a cart
     *
     * Create an empty cart, or a cart containing the information provided in input:   - An air offer can be added in the cart specifying its id or a complete list of bound IDs via the &#39;airOfferId&#39; / &#39;airBoundIds&#39; query parameters   - A list of sub-resources (such as Travelers, Contacts, Frequent flyer cards) can be specified in input using the &#39;CartRequest&#39; body parameter   - When relevant, the sub-resources can be associated using temporary ids. Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCartTest() {
        String lang = null;
        CartRequest postCartBody = null;
        //CartReply response = api.createCart(lang, postCartBody);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Add contact information to a cart
     *
     * Add contact to the cart. There are three types of contact: phone, email and address. For more information on a specific type of contact, please see the page [Contacts documentation](http://e-travel.mkt.amadeus.net/dxapi/display/contacts.html#!/ContactType/get). Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createContactsInCartTest() {
        String cartId = null;
        List<Contact> postContactsBody = null;
        String lastName = null;
        String lang = null;
        //ContactsListReply response = api.createContactsInCart(cartId, postContactsBody, lastName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Add extensions to a cart
     *
     * Add extensions to the cart.  
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createExtensionsInCartTest() {
        String cartId = null;
        List<Extension> postExtensionsBody = null;
        String lastName = null;
        //ExtensionListReply response = api.createExtensionsInCart(cartId, postExtensionsBody, lastName);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Add frequent flyer cards information to a cart
     *
     * Add frequent flyer cards to the cart.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createFrequentFlyerCardsInCartTest() {
        String cartId = null;
        List<FrequentFlyerCard> postFrequentFlyerCardsBody = null;
        String lastName = null;
        String lang = null;
        //FrequentFlyerCardsListReply response = api.createFrequentFlyerCardsInCart(cartId, postFrequentFlyerCardsBody, lastName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Create one or several travelers(s)
     *
     * Create one or several travelers(s), i.e. individual traveling, and add them to a given cart. Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTravelersInCartTest() {
        String cartId = null;
        List<Traveler> postTravelersBody = null;
        String lastName = null;
        String lang = null;
        //TravelersListReply response = api.createTravelersInCart(cartId, postTravelersBody, lastName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Delete regulatory from the cart.
     *
     * Delete specific regulatory details for Advance Passenger Information data from the Cart for the given traveler.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAPISFromCartTest() {
        String cartId = null;
        String travelerId = null;
        String regulatoryApisDetailId = null;
        String lang = null;
        //api.deleteAPISFromCart(cartId, travelerId, regulatoryApisDetailId, lang);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Delete regulatory information from the Cart.
     *
     * Delete the given Advance Passenger Information (regulatory document or address) from the Cart for the given traveler.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAPISsFromCartTest() {
        String cartId = null;
        String travelerId = null;
        List<String> regulatoryApisDetailIds = null;
        String lang = null;
        //api.deleteAPISsFromCart(cartId, travelerId, regulatoryApisDetailIds, lang);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Remove a specific offer from a cart
     *
     * Delete offer from a cart.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAirOfferFromCartTest() {
        String cartId = null;
        String airOfferId = null;
        String lastName = null;
        String lang = null;
        //api.deleteAirOfferFromCart(cartId, airOfferId, lastName, lang);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Delete a contact
     *
     * Delete a contact from a cart.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteContactFromCartTest() {
        String cartId = null;
        String contactId = null;
        String lastName = null;
        String lang = null;
        //api.deleteContactFromCart(cartId, contactId, lastName, lang);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Remove contacts from a cart
     *
     * Delete contacts from a cart.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteContactsFromCartTest() {
        String cartId = null;
        List<String> contactIds = null;
        String lastName = null;
        String lang = null;
        //api.deleteContactsFromCart(cartId, contactIds, lastName, lang);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Delete an extension from a cart
     *
     * Delete an extension from a cart.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteExtensionTest() {
        String cartId = null;
        String extensionId = null;
        String lastName = null;
        //api.deleteExtension(cartId, extensionId, lastName);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Delete FOID(s) from the cart.
     *
     * Delete the given Form of Identification from the cart based on its id. For more information on the Form of identification details, please see the page [FOID documentation](http://e-travel.mkt.amadeus.net/dxapi/display/foid.html#!/IdentificationType/get). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFOIDFromCartTest() {
        String cartId = null;
        String formOfIdentificationDetailId = null;
        String lang = null;
        //api.deleteFOIDFromCart(cartId, formOfIdentificationDetailId, lang);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Delete FOID(s) from the cart.
     *
     * Delete the given Form of Identification from the cart
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFOIDsFromCartTest() {
        String cartId = null;
        List<String> formOfIdentificationDetailIds = null;
        String lang = null;
        //api.deleteFOIDsFromCart(cartId, formOfIdentificationDetailIds, lang);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Delete a frequent flyer card.
     *
     * Delete a frequent flyer card from a cart.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFrequentFlyerCardFromCartTest() {
        String cartId = null;
        String frequentFlyerCardId = null;
        String lastName = null;
        String lang = null;
        //api.deleteFrequentFlyerCardFromCart(cartId, frequentFlyerCardId, lastName, lang);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Remove frequent flyer cards from a cart
     *
     * Delete frequent flyer cards from a cart.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFrequentFlyerCardsFromCartTest() {
        String cartId = null;
        List<String> frequentFlyerCardIds = null;
        String lastName = null;
        String lang = null;
        //api.deleteFrequentFlyerCardsFromCart(cartId, frequentFlyerCardIds, lastName, lang);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Remove a specific hotel offer from a cart
     *
     * Delete the hotel offer corresponding to the given hotelOfferId from a cart. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteHotelOfferFromCartTest() {
        String cartId = null;
        String hotelOfferId = null;
        String lang = null;
        //api.deleteHotelOfferFromCart(cartId, hotelOfferId, lang);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Remove hotel offers from a cart
     *
     * Delete hotel offers from a cart.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteHotelOffersFromCartTest() {
        String cartId = null;
        List<String> hotelOfferIds = null;
        String lang = null;
        //api.deleteHotelOffersFromCart(cartId, hotelOfferIds, lang);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Delete seat from a cart
     *
     * Delete seat from a cart.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSeatFromCartTest() {
        String cartId = null;
        String seatId = null;
        String lastName = null;
        String lang = null;
        //api.deleteSeatFromCart(cartId, seatId, lastName, lang);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Remove seats from a cart
     *
     * Delete seats from a cart.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSeatsFromCartTest() {
        String cartId = null;
        List<String> seatIds = null;
        String lastName = null;
        String lang = null;
        //api.deleteSeatsFromCart(cartId, seatIds, lastName, lang);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Delete service from a cart
     *
     * Delete service from a cart.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteServiceFromCartTest() {
        String cartId = null;
        String serviceId = null;
        String lastName = null;
        String lang = null;
        //api.deleteServiceFromCart(cartId, serviceId, lastName, lang);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Remove services from a cart
     *
     * Delete services from a cart.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteServicesFromCartTest() {
        String cartId = null;
        List<String> serviceIds = null;
        String lastName = null;
        String lang = null;
        //api.deleteServicesFromCart(cartId, serviceIds, lastName, lang);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Delete a traveler.
     *
     * Delete a traveler from a cart. A traveler associated to an offer can not be deleted. Please consider that all sub-resources (i.e. Contacts, Frequent Flyer, etc.) associated to the traveler will be removed from cart as well. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTravelerFromCartTest() {
        String cartId = null;
        String travelerId = null;
        String lastName = null;
        String lang = null;
        //api.deleteTravelerFromCart(cartId, travelerId, lastName, lang);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Remove travelers from a cart
     *
     * Delete travelers from a cart. A traveler associated to an offer can not be deleted.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTravelersFromCartTest() {
        String cartId = null;
        List<String> travelerIds = null;
        String lastName = null;
        String lang = null;
        //api.deleteTravelersFromCart(cartId, travelerIds, lastName, lang);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Partial update of a contact
     *
     * Update one or more fields associated to a contact in a cart. There are three types of contact: phone, email and address. For more information on a specific type of contact, please see the page [Contacts documentation](http://e-travel.mkt.amadeus.net/dxapi/display/contacts.html#!/ContactType/get). Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchContactInCartTest() {
        String cartId = null;
        String contactId = null;
        Contact patchContactBody = null;
        String lastName = null;
        String lang = null;
        //ContactReply response = api.patchContactInCart(cartId, contactId, patchContactBody, lastName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Partial update of the contacts
     *
     * Update one or more fields associated to the contacts in a cart. There are three types of contact: phone, email and address. For more information on a specific type of contact, please see the page [Contacts documentation](http://e-travel.mkt.amadeus.net/dxapi/display/contacts.html#!/ContactType/get). Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchContactsInCartTest() {
        String cartId = null;
        List<Contact> patchContactsBody = null;
        String lastName = null;
        String lang = null;
        //ContactsListReply response = api.patchContactsInCart(cartId, patchContactsBody, lastName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Partial update of a frequent flyer card
     *
     * Update one or more fields associated to a frequent flyer card in a cart.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchFrequentFlyerCardInCartTest() {
        String cartId = null;
        String frequentFlyerCardId = null;
        FrequentFlyerCard patchFrequentFlyerCardBody = null;
        String lastName = null;
        String lang = null;
        //FrequentFlyerCardReply response = api.patchFrequentFlyerCardInCart(cartId, frequentFlyerCardId, patchFrequentFlyerCardBody, lastName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Partial update of frequent flyer cards information
     *
     * Update one or more fields associated to the frequent flyer cards in a cart.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchFrequentFlyerCardsInCartTest() {
        String cartId = null;
        List<FrequentFlyerCard> patchFrequentFlyerCardsBody = null;
        String lastName = null;
        String lang = null;
        //FrequentFlyerCardsListReply response = api.patchFrequentFlyerCardsInCart(cartId, patchFrequentFlyerCardsBody, lastName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Update a seat in a cart
     *
     * Update a seat currently stored in the cart. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchSeatFromCartTest() {
        String cartId = null;
        String seatId = null;
        UpdateSeatItemRequest patchSeatBody = null;
        String lastName = null;
        String lang = null;
        //SeatReply response = api.patchSeatFromCart(cartId, seatId, patchSeatBody, lastName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Partial update of existing seats in cart
     *
     * Partial update of seats in the cart. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchSeatsInCartTest() {
        String cartId = null;
        List<UpdateSeatItemsRequest> patchSeatsBody = null;
        String lastName = null;
        String lang = null;
        //SeatsReply response = api.patchSeatsInCart(cartId, patchSeatsBody, lastName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Update a service from a cart
     *
     * Update a service currently stored in the cart. Service dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchServiceFromCartTest() {
        String cartId = null;
        String serviceId = null;
        UpdateServiceItemRequest patchServiceBody = null;
        String lastName = null;
        String lang = null;
        //ServiceReply response = api.patchServiceFromCart(cartId, serviceId, patchServiceBody, lastName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Partial update of existing services in cart
     *
     * Partial update of existing services in the cart. Service dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchServicesInCartTest() {
        String cartId = null;
        List<UpdateServiceItemsRequest> patchServicesBody = null;
        String lastName = null;
        String lang = null;
        //ServicesReply response = api.patchServicesInCart(cartId, patchServicesBody, lastName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Partial update of a traveler
     *
     * Update one or more attributes of a traveler in a cart. The passenger type code (PTC) of a traveler associated to an offer can not be modified. Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchTravelerInCartTest() {
        String cartId = null;
        String travelerId = null;
        Traveler patchTravelerBody = null;
        String lastName = null;
        String lang = null;
        //TravelerReply response = api.patchTravelerInCart(cartId, travelerId, patchTravelerBody, lastName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Partial update of travelers
     *
     * Update one or more fields associated to the travelers in a cart. Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchTravelersInCartTest() {
        String cartId = null;
        List<Traveler> patchTravelersBody = null;
        String lastName = null;
        String lang = null;
        //TravelersListReply response = api.patchTravelersInCart(cartId, patchTravelersBody, lastName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve a specific regulatory information for a specific traveler from a Cart
     *
     * Retrieve specific regulatory details for Advance Passenger Information for a specific traveler from a Cart. The data can contain a regulatory document or an address. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveAPISFromCartTest() {
        String cartId = null;
        String travelerId = null;
        String regulatoryApisDetailId = null;
        String lang = null;
        //RegulatoryApisDetailListReply response = api.retrieveAPISFromCart(cartId, travelerId, regulatoryApisDetailId, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve an offer
     *
     * Retrieve an offer from a cart based on its id. Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveAirOfferFromCartTest() {
        String cartId = null;
        String airOfferId = null;
        String lastName = null;
        String lang = null;
        //AirOfferReply response = api.retrieveAirOfferFromCart(cartId, airOfferId, lastName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve all offers from a cart
     *
     * Retrieve all AirOffers from a Cart based on cart id. Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveAirOffersFromCartTest() {
        String cartId = null;
        //AirOffersInCartReply response = api.retrieveAirOffersFromCart(cartId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve shopping cart
     *
     * Retrieve a cart  based on its cart id. Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveCartTest() {
        String cartId = null;
        String lastName = null;
        String lang = null;
        Boolean refresh = null;
        //CartReply response = api.retrieveCart(cartId, lastName, lang, refresh);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve contact information
     *
     * Retrieve contact information from a cart based on its id. There are three types of contact: phone, email and address. For more information on a specific type of contact, please see the page [Contacts documentation](http://e-travel.mkt.amadeus.net/dxapi/display/contacts.html#!/ContactType/get). Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveContactFromCartTest() {
        String cartId = null;
        String contactId = null;
        String lastName = null;
        String lang = null;
        //ContactReply response = api.retrieveContactFromCart(cartId, contactId, lastName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve contact information
     *
     * Retrieve a list of contacts for a cart based on the cart id. There are three types of contact: phone, email and address. For more information on a specific type of contact, please see the page [Contacts documentation](http://e-travel.mkt.amadeus.net/dxapi/display/contacts.html#!/ContactType/get). Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveContactsFromCartTest() {
        String cartId = null;
        String lastName = null;
        String lang = null;
        //ContactsListReply response = api.retrieveContactsFromCart(cartId, lastName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve an extension
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveExtensionFromCartTest() {
        String cartId = null;
        String extensionId = null;
        String lastName = null;
        //ExtensionReply response = api.retrieveExtensionFromCart(cartId, extensionId, lastName);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve all extensions
     *
     * Retrieve all extensions. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveExtensionsFromCartTest() {
        String cartId = null;
        String lastName = null;
        //ExtensionListReply response = api.retrieveExtensionsFromCart(cartId, lastName);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve FOID data from a cart based on its id.
     *
     * Retrieve Form of Identification data from a cart. The data can contain a regulatory document or a frequent flyer card (the payment card is currently not available to be stored in the cart). For more information on the Form of identification details, please see the page [FOID documentation](http://e-travel.mkt.amadeus.net/dxapi/display/foid.html#!/IdentificationType/get). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveFOIDFromCartTest() {
        String cartId = null;
        String formOfIdentificationDetailId = null;
        String lang = null;
        //FormOfIdentificationDetailListReply response = api.retrieveFOIDFromCart(cartId, formOfIdentificationDetailId, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve FOID data from a cart
     *
     * Retrieve Form of Identification data for a specific traveler from a cart. The data can contain a regulatory document or a frequent flyer card (payment card is not yet available). For more information on the Form of identification details, please see the page [FOID documentation](http://e-travel.mkt.amadeus.net/dxapi/display/foid.html#!/IdentificationType/get). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveFOIDsFromCartTest() {
        String cartId = null;
        String lang = null;
        //FormOfIdentificationDetailListReply response = api.retrieveFOIDsFromCart(cartId, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve frequent flyer card information
     *
     * Retrieve frequent flyer card information from a cart based on its id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveFrequentFlyerCardFromCartTest() {
        String cartId = null;
        String frequentFlyerCardId = null;
        String lastName = null;
        String lang = null;
        //FrequentFlyerCardReply response = api.retrieveFrequentFlyerCardFromCart(cartId, frequentFlyerCardId, lastName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve frequent flyer cards information.
     *
     * Retrieve a list of frequent flyer cards from a cart based on the cart id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveFrequentFlyerCardsFromCartTest() {
        String cartId = null;
        String lastName = null;
        String lang = null;
        //FrequentFlyerCardsListReply response = api.retrieveFrequentFlyerCardsFromCart(cartId, lastName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve a specific hotel offer from a cart
     *
     * Retrieve the hotel offer corresponding to the given hotelOfferId from a cart. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveHotelOfferFromCartTest() {
        String cartId = null;
        String hotelOfferId = null;
        String lang = null;
        //HotelOffersListReply response = api.retrieveHotelOfferFromCart(cartId, hotelOfferId, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve all hotel offers from a cart
     *
     * Retrieve all HotelOffers from a Cart based on cart id. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveHotelOffersFromCartTest() {
        String cartId = null;
        //HotelOffersListReply response = api.retrieveHotelOffersFromCart(cartId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve regulatory data for a specific traveler from a Cart
     *
     * Retrieve Advance Passenger Information data for a specific traveler from a Cart. The data can contain a regulatory documents or an addresses. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveRegulatoryDetailsFromCartTest() {
        String cartId = null;
        String travelerId = null;
        String lang = null;
        //RegulatoryApisDetailListReply response = api.retrieveRegulatoryDetailsFromCart(cartId, travelerId, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve a seat from a cart
     *
     * Retrieve a seat currently stored in the cart. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveSeatFromCartTest() {
        String cartId = null;
        String seatId = null;
        String lastName = null;
        String lang = null;
        //SeatReply response = api.retrieveSeatFromCart(cartId, seatId, lastName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve seats from a cart
     *
     * Retrieve seats currently present in the cart. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveSeatsFromCartTest() {
        String cartId = null;
        String lastName = null;
        //SeatsReply response = api.retrieveSeatsFromCart(cartId, lastName);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve a service from a cart
     *
     * Retrieve a service currently stored in the cart. Service dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveServiceFromCartTest() {
        String cartId = null;
        String serviceId = null;
        String lastName = null;
        String lang = null;
        //ServiceReply response = api.retrieveServiceFromCart(cartId, serviceId, lastName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve services from a cart
     *
     * Retrieve services currently stored in the cart. Service dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveServicesFromCartTest() {
        String cartId = null;
        String lastName = null;
        //ServicesReply response = api.retrieveServicesFromCart(cartId, lastName);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve a specific traveler from a cart
     *
     * Retrieve a traveler from a Cart based on its id. Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveTravelerFromCartTest() {
        String cartId = null;
        String travelerId = null;
        String lastName = null;
        String lang = null;
        //TravelerReply response = api.retrieveTravelerFromCart(cartId, travelerId, lastName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve all travelers from a cart
     *
     * Retrieve all travelers from a Cart based on cart id. Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveTravelersFromCartTest() {
        String cartId = null;
        String lastName = null;
        String lang = null;
        //TravelersListReply response = api.retrieveTravelersFromCart(cartId, lastName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Update regulatory information in the Cart.
     *
     * Update specific regulatory details for Advance Passenger Information (regulatory document or address) in the Cart for a given traveler. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAPISInCartTest() {
        String cartId = null;
        String travelerId = null;
        String regulatoryApisDetailId = null;
        RegulatoryApisDetail patchAPISBody = null;
        String lang = null;
        //RegulatoryApisDetailListReply response = api.updateAPISInCart(cartId, travelerId, regulatoryApisDetailId, patchAPISBody, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Update regulatory information in the Cart.
     *
     * Update the Advance Passenger Information details (regulatory documents or addresses) in the Cart for a given traveler. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAPISsInCartTest() {
        String cartId = null;
        String travelerId = null;
        List<RegulatoryApisDetail> patchAPISBody = null;
        String lang = null;
        //RegulatoryApisDetailListReply response = api.updateAPISsInCart(cartId, travelerId, patchAPISBody, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Update a cart
     *
     * Update an existing cart with the data provided in input:   - It is possible to add, update or delete sub-resources from the Cart.   - A list of sub-resources (such as Travelers, Contacts, Frequent flyer cards, Seats and Services) can be specified in input using the &#39;CartRequest&#39; body parameter   - Contacts, Frequent flyer cards, Seats and Services can be associated to Travelers using temporary ids, when those sub-resources are manipulated in the same transaction   - Air offers cannot be added, updated nor deleted through this operation Dictionary structure is available on page [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCartTest() {
        String cartId = null;
        UpdateCartRequest patchCartBody = null;
        String lastName = null;
        String lang = null;
        //CartReply response = api.updateCart(cartId, patchCartBody, lastName, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Update FOID information in the cart.
     *
     * Update the details for the given form of identification (regulatory document or frequent flyer) in the cart. The payment card is currently not available to be stored in the cart. For more information on the Form of identification details, please see the page [FOID documentation](http://e-travel.mkt.amadeus.net/dxapi/display/foid.html#!/IdentificationType/get). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateFOIDInCartTest() {
        String cartId = null;
        String formOfIdentificationDetailId = null;
        FormOfIdentificationDetail patchFOIDBody = null;
        String lang = null;
        //FormOfIdentificationDetailListReply response = api.updateFOIDInCart(cartId, formOfIdentificationDetailId, patchFOIDBody, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Update FOID information in the cart.
     *
     * Update the form of identification details (regulatory document or frequent flyer) in the cart for a list of travelers The payment card is currently not available to be stored in the cart. For more information on the Form of identification details, please see the page [FOID documentation](http://e-travel.mkt.amadeus.net/dxapi/display/foid.html#!/IdentificationType/get). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateFOIDsInCartTest() {
        String cartId = null;
        List<FormOfIdentificationDetail> patchFOIDsBody = null;
        String lang = null;
        //FormOfIdentificationDetailListReply response = api.updateFOIDsInCart(cartId, patchFOIDsBody, lang);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
}
