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
* BusinessParticpant responsible for approving an Agreement. 
 @since SID_R16.5
*/ 

public  class AgreementAuthorization  {



/**  
* Field agreementAuthorizationState
* Current status of the authorization, for example in process, approved, 

*  rejected. 

*/
protected String agreementAuthorizationState ;




/**  
* Field agreementAuthorizationDate
* The date associated with the status. 

*/
protected TimePeriod agreementAuthorizationDate ;




/**  
* Field agreementSignatureRepresentation
* Indication that represents whether the signature is a physical paper s 

* ignature or a digital signature. 

*/
protected String agreementSignatureRepresentation ;




/**  
* Field agreementApproval
*/
protected AgreementApproval agreementApproval ;




/**  
* Field businessInteractionRole
*/
protected BusinessInteractionRole businessInteractionRole ;


}