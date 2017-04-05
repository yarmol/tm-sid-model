/**
* Party Order ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.a.eG_.oE4.cE.eO_X.pEX.s37Q.e.w-content.html">Party Order ABE</a> 
* The Party Order ABE contains all entities required to specify a commun 
* ication used to procure or update one or many Products in the context  
* of a ProductOffering. 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_order_business_entity ;

/**
* A PartyOrder is a type of BusinessInteration that represents a communi 
* cation used to procure or update one or many Products in the context o 
* f a ProductOffering through all its PartyOrderItems.One or many PartyR 
* oles might be involved in a PartyOrder / PartyOrderItem such as Distri 
* butor, Holder, Buyer or DeliveryDriver.The PartyOrder and PartyOrderIt 
* ems specify the PartyAccount to which the Products charges will be cha 
* rged.A complete PartyOrder or PartyOrderItems might be paid through on 
* e or many PartyPayments.A PartyOrderItem may need other PartyOrderItem 
* s to be completed; this dependency is represented through the "/PartyO 
* rderItemRefrencesReferencedBy" relationship. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Business Interaction ABE::BusinessInteraction @since SID_R16.5
*/ 

public  class PartyOrder extends BusinessInteraction {



/**  
* Field partyOrderType
* An indicatory that specifies the kind of PartyOrder. 

*/
protected String partyOrderType ;




/**  
* Field purchaseOrderNumber
* A number that uniquely identifies a PartyOrder within the ordering Par 

* ty's enterprise. 

*/
protected String purchaseOrderNumber ;




/**  
* Field assignedPriority
* The order's assigned priority after review. 

*/
protected Integer assignedPriority ;




/**  
* Field assignedResponsibilityDate
* The target response date assigned after review. 

*/
protected DateTime assignedResponsibilityDate ;




/**  
* Field dueDate
* The date upon which the PartyOrder is due for completion. 

*/
protected DateTime dueDate ;




/**  
* Field partyOrderItem
*/
protected List<PartyOrderItem> partyOrderItem ;




/**  
* Field dunningCaseRule
*/
protected DunningCaseRule dunningCaseRule ;




/**  
* Field partyRole
*/
protected List<PartyRole> partyRole ;




/**  
* Field partyAccount
*/
protected List<PartyAccount> partyAccount ;




/**  
* Field partyPayment
*/
protected List<PartyPayment> partyPayment ;


}