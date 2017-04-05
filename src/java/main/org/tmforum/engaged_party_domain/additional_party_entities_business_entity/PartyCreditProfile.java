/**
* Additional Party Entities ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.a.eN.tUE4.cE.eO_X.pEX.s37Q.e.w-content.html">Additional Party Entities ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.additional_party_entities_business_entity ;

/**
* An outline of a Party's credit worthiness. 
 @since SID_R16.5
*/ 

public  class PartyCreditProfile  {



/**  
* Field ID
* The identifier of the credit profile. 

*/
protected String ID ;




/**  
* Field creditProfileDate
* The date the profile was established. 

*/
protected DateTime creditProfileDate ;




/**  
* Field validFor
* The period for which the profile is valid. 

*/
protected TimePeriod validFor ;




/**  
* Field creditRiskRating
* This is an integer whose value is used to rate the risk of this Party  

* paying late or defaulting versus paying on time. 

*/
protected Integer creditRiskRating ;




/**  
* Field creditScore
* A measure of a person?s or organization?s creditworthiness calculated  

* on the basis of a combination of factors such as their income and cred 

* it history.</br></br> 

*/
protected Integer creditScore ;




/**  
* Field partyCreditProfileReference
*/
protected List<PartyCreditProfileReference> partyCreditProfileReference ;




/**  
* Field partyRole
*/
protected PartyRole partyRole ;


}