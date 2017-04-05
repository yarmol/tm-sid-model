/**
* Dunning ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.a.i.f.w.wE4.cE.eO_X.pEX.s37Q.e.w-content.html">Dunning ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_revenue_abe.party_bill_collection_abe.dunning_business_entity ;

/**
* A DunningNotification is a communication or joint activity from the Te 
* lecommunication Operator to the party to ask for a PartyPayment or neg 
* otiate a PaymentPlan.The relation resulting from a DunningCaseRule mig 
* ht be •&nbsp;&nbsp;&nbsp;&nbsp;either only from the telecommunication  
* operator to the party (Ex: send a SMS) •&nbsp;&nbsp;&nbsp;&nbsp;or in  
* both ways (Ex: a CSR call the party to negotiate a PaymentPlan).  

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Business Interaction ABE::BusinessInteraction @since SID_R16.5
*/ 

public  class DunningNotification extends BusinessInteraction {



/**  
* Field dunningCaseRule
*/
protected DunningCaseRule dunningCaseRule ;




/**  
* Field date
* The date represents the date at which the notification is done. 

*/
protected DateTime date ;


}