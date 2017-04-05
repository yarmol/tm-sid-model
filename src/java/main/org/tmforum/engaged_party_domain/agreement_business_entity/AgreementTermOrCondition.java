/**
* Agreement ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93D4015D4013F-content.html">Agreement ABE</a> 
* Represents a contract or arrangement, either written or verbal and som 
* etimes enforceable by law, such as a service level agreement or a cust 
* omer price agreement. An agreement involves a number of other business 
*  entities, such as products, services, and resources and/or their spec 
* ifications. 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.agreement_business_entity ;

/**
* Aspects of the Agreement not formally specified elsewhere in the Agree 
* ment and that cannot be captured elsewhere in a formal notation, or au 
* tomatically monitored and require a more human level of management. 
 @since SID_R16.5
*/ 

public  class AgreementTermOrCondition  {



/**  
* Field termOrConditionNumber
* Unique number assigned for reference. 

*/
protected String termOrConditionNumber ;




/**  
* Field description
* Text that explains the AgreementTermOrCondition. 

*/
protected String description ;




/**  
* Field validFor
* The period of time during which the AgreementTermOrCondition applies. 

*/
protected TimePeriod validFor ;




/**  
* Field agreement
*/
protected Agreement agreement ;




/**  
* Field agreementItem
*/
protected List<AgreementItem> agreementItem ;




/**  
* Field productOfferingTerm
*/
protected List<ProductOfferingTerm> productOfferingTerm ;


}