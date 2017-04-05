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
* A BusinessInteraction is an arrangement, contract, communication or jo 
* int activity between one or more PartyRoles, ResourceRoles, or Custome 
* rAccounts. A BusinessInteraction may consist of one or more BusinessIn 
* teractionItems. A BusinessInteractionItem may refer to a Product, Serv 
* ice, Resource, or one of their specifications. A BusinessInteraction i 
* s further defined by one or more Places. One BusinessInteraction may r 
* eference another BusinessInteraction and one BusinessInteractionItem m 
* ay reference another BusinessInteractionItem on the same or different  
* BusinessInteraction. There are five types of BusinessInteractions: Req 
* uests, Responses, Notifications, Agreements, and Instructions. 
 @since SID_R16.5
*/ 

public abstract class BusinessInteraction  {



/**  
* Field ID
* Unique identifier for Interaction. 

*/
protected String ID ;




/**  
* Field interactionDate
* Date interaction initiated. 

*/
protected DateTime interactionDate ;




/**  
* Field description
*/
protected String description ;




/**  
* Field interactionDateComplete
* The date on which an interaction is closed or completed.</br></br> 

*/
protected DateTime interactionDateComplete ;




/**  
* Field interactionStatus
* The current condition of an interaction, such as open, in research, cl 

* osed, and so forth. 

*/
protected String interactionStatus ;




/**  
* Field businessInteraction
*/
protected List<BusinessInteraction> businessInteraction ;




/**  
* Field businessInteraction1
*/
protected List<BusinessInteraction> businessInteraction1 ;




/**  
* Field businessInteractionRole
*/
protected List<BusinessInteractionRole> businessInteractionRole ;




/**  
* Field businessInteractionVersion
*/
protected List<BusinessInteractionVersion> businessInteractionVersion ;




/**  
* Field businessInteractionSpec
*/
protected BusinessInteractionSpec businessInteractionSpec ;




/**  
* Field businessInteractionItem
*/
protected List<BusinessInteractionItem> businessInteractionItem ;




/**  
* Field businessInteractionType
*/
protected BusinessInteractionType businessInteractionType ;




/**  
* Field loyaltyExecutionPoint
*/
protected LoyaltyExecutionPoint loyaltyExecutionPoint ;




/**  
* Field attachment
*/
protected List<Attachment> attachment ;




/**  
* Field businessInteractionItem
*/
protected BusinessInteractionLocation businessInteractionItem ;




/**  
* Field businessInteraction
*/
protected List<BusinessInteraction> businessInteraction ;




/**  
* Field businessInteraction2
*/
protected List<BusinessInteraction> businessInteraction2 ;


}