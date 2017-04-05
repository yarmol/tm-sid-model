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
* An entity involved in a BusinessInteraction.  The entity may be a Part 
* y playing a PartyRole or a Resource playing a ResourceRole, such as a  
* system. 
 @since SID_R16.5
*/ 

public  class BusinessInteractionRole  {



/**  
* Field interactionRole
* The part a BusinessActor plays in an interaction, such as requester, r 

* esponder, recipient, and so forth. 

*/
protected String interactionRole ;




/**  
* Field businessInteraction
*/
protected BusinessInteraction businessInteraction ;




/**  
* Field businessInteractionItem
*/
protected List<BusinessInteractionItem> businessInteractionItem ;




/**  
* Field agreementAuthorization
*/
protected List<AgreementAuthorization> agreementAuthorization ;


}