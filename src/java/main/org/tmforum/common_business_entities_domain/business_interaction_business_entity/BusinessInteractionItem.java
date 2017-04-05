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
* The purpose for the BusinessInteraction expressed in terms of a Produc 
* tSpecification, ProductOffering, ServiceSpecification or ResourceSpeci 
* fication or may refer to a Product, Service, or Resource. 
 @since SID_R16.5
*/ 

public abstract class BusinessInteractionItem  {



/**  
* Field quantity
* Quantity of an interaction item involved in an interaction. 

*/
protected Quantity quantity ;




/**  
* Field action
* The action to take for an InteractionItem, such as add, change, remove 

* . 

*/
protected String action ;




/**  
* Field businessInteractionItem
*/
protected List<BusinessInteractionItem> businessInteractionItem ;




/**  
* Field businessInteractionItem1
*/
protected List<BusinessInteractionItem> businessInteractionItem1 ;




/**  
* Field service
*/
protected Service service ;




/**  
* Field resource
*/
protected Resource resource ;




/**  
* Field resourceSpecification
*/
protected ResourceSpecification resourceSpecification ;




/**  
* Field serviceSpecification
*/
protected ServiceSpecification serviceSpecification ;




/**  
* Field businessInteractionRole
*/
protected List<BusinessInteractionRole> businessInteractionRole ;




/**  
* Field productSpecification
*/
protected ProductSpecification productSpecification ;




/**  
* Field product
*/
protected Product product ;




/**  
* Field productOffering
*/
protected ProductOffering productOffering ;




/**  
* Field businessInteraction
*/
protected BusinessInteraction businessInteraction ;




/**  
* Field businessInteractionItemRelationship
*/
protected List<BusinessInteractionItemRelationship> businessInteractionItemRelationship ;




/**  
* Field businessInteractionItemRelationship2
*/
protected List<BusinessInteractionItemRelationship> businessInteractionItemRelationship2 ;




/**  
* Field businessInteractionLocation
*/
protected BusinessInteractionLocation businessInteractionLocation ;


}