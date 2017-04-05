/**
* Business Interaction ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93C18FFFD032B-content.html">Business Interaction ABE</a> 
* The Business Interaction ABE represents an arrangement, contract, or c 
* ommunication between an enterprise and one or more other entities such 
*  as individuals and organizations (or parts of organizations).  Intera 
* ctions take on the form of requests, responses, and notifications. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.business_interaction_business_entity ;

/**
* This entity represents a document which is related to the BusinessInte 
* raction. This can be a document that was provided by the Customer (suc 
* h as report, log or picture showing a problem with one of the products 
* ), or a document provided by the CSP to the customer as part of the in 
* teraction (such as manual or a brochure) 
 @since SID_R16.5
*/ 

public  class Attachment  {



/**  
* Field customerProblemWorkaround
*/
protected CustomerProblemWorkaround customerProblemWorkaround ;




/**  
* Field location
* A URI or URL pointing to the document itself in a document repository 

*/
protected String location ;




/**  
* Field businessInteraction
*/
protected List<BusinessInteraction> businessInteraction ;




/**  
* Field partyProblemWorkaround
*/
protected PartyProblemWorkaround partyProblemWorkaround ;


}