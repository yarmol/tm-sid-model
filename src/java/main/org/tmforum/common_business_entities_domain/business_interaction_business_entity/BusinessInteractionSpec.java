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
* The invariant characteristics (attributes in the business view, and me 
* thods, constraints, relationships, and behavior in the system view) an 
* d behavior of a BusinessInteraction. This is done by optionally defini 
* ng a set of BusinessInteractionSpecItems, each of which aggregates one 
*  or more other types of Specifications. This helps to ensure that diff 
* erent BusinessInteractions have the same basic characteristics and beh 
* avior by deriving them from the same BusinessInteractionSpec. 
 @since SID_R16.5
*/ 

public  class BusinessInteractionSpec  {



/**  
* Field businessInteraction
*/
protected List<BusinessInteraction> businessInteraction ;


}