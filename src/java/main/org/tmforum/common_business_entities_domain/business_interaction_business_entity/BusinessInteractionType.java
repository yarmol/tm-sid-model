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
* The possible types of BusinessInteractions that can occur. BusinessInt 
* eractionTypes can be with the associated BusinessParticipantTypes that 
*  can participate in a BusinessInteraction. 
 @since SID_R16.5
*/ 

public  class BusinessInteractionType  {



/**  
* Field name
* The name of an Interaction Type, such as Customer Inquiry, Customer Qu 

* ote/Offer, Trouble Report. 

*/
protected String name ;




/**  
* Field description
* A brief narrative that describes an Interaction Type. 

*/
protected String description ;




/**  
* Field businessInteractionType
*/
protected List<BusinessInteractionType> businessInteractionType ;




/**  
* Field businessInteractionType1
*/
protected List<BusinessInteractionType> businessInteractionType1 ;




/**  
* Field businessInteraction
*/
protected List<BusinessInteraction> businessInteraction ;


}