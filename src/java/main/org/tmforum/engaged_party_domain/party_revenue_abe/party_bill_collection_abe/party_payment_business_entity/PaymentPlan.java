/**
* Party Payment ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.a.i.f.wY.k4.cE.eO_X.pEX.s37Q.e.w-content.html">Party Payment ABE</a> 
* The Party Payment ABE contains all Entities required to describe a pay 
* ment such as PaymentMethod and BankAccount. 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_revenue_abe.party_bill_collection_abe.party_payment_business_entity ;

/**
* PaymentPlan defines the plan for payment via its associations to the P 
* aymentMethod and PaymentAccount. 
 @since SID_R16.5
*/ 

public  class PaymentPlan  {



/**  
* Field ID
* Unique identifier  

*/
protected String ID ;




/**  
* Field validFor
* Valid period for the PaymentPlan. 

*/
protected TimePeriod validFor ;




/**  
* Field maxAmount
* The maximum amount of the Payment when at least one PaymentMethod is d 

* eclared so that the company generates each Payment. For example, with  

* a due debt of $250, and a maxPaymentAmount of $100, 2 payments of $100 

*  will be generated and the last one will be $50. 

*/
protected Money maxAmount ;




/**  
* Field totalAmount
* The total amount that the PaymentPlan has to recover through payments. 

*/
protected Money totalAmount ;




/**  
* Field paymentDay
* The day chosen by the party for generating the payments 

*/
protected Integer paymentDay ;




/**  
* Field paymentPeriod
* The period of time between two payments. 

*/
protected Duration paymentPeriod ;




/**  
* Field priority
* The priority of the PaymentPlan amongst all the PaymentPlans agree wit 

* h the same PartyRole. 

*/
protected Integer priority ;




/**  
* Field type
*/
protected String type ;




/**  
* Field status
* A PayemntPlan might be initialized, validated,in progress or closed. 

*/
protected String status ;




/**  
* Field maxTrialTimes
* Maximum number of trial to submit a payment if it has been rejected. 

*/
protected Integer maxTrialTimes ;




/**  
* Field paymentMethod
*/
protected List<PaymentMethod> paymentMethod ;




/**  
* Field partyAccount
*/
protected List<PartyAccount> partyAccount ;




/**  
* Field partyPayment
*/
protected List<PartyPayment> partyPayment ;




/**  
* Field paymentPlanPaymentMethod
*/
protected List<PaymentPlanPaymentMethod> paymentPlanPaymentMethod ;




/**  
* Field customerAccount
*/
protected List<CustomerAccount> customerAccount ;


}