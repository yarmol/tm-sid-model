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
* A Location involved in an interaction. For example, John R.s home addr 
* ess is the location where an ordered Product will be installed. 
 @since SID_R16.5
*/ 

public  class BusinessInteractionLocation  {



/**  
* Field businessInteractionItem
*/
protected List<BusinessInteractionItem> businessInteractionItem ;




/**  
* Field place
*/
protected Place place ;




/**  
* Field businessInteraction
*/
protected List<BusinessInteraction> businessInteraction ;




/**  
* Field locationRole
* The locationRole specifies the role of the location (i.e. related Plac 

* e) for the BusinessInteraction or BusinessInteractionItem. For example 

* , it can be "installation" when related to a PartyOrderItem. 

*/
protected String locationRole ;


}