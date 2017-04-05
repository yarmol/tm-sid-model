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
* The purpose for a ServiceLevelAgreement expressed in terms of a Produc 
* t, Service, Resource, and/or their respective specifications, inherite 
* d from BusinessInteractionItem and in terms of ServiceLevelSpecificati 
* on(s). 

Inheritance tree: |- 
 <a title="SID Models::Engaged Party Domain::Agreement ABE::AgreementItem" href="_3E3F0EC000E93D4017B80285-content.html">SID Models::Engaged Party Domain::Agreement ABE::AgreementItem</a> |- 
 SID Models::Common Business Entities Domain::Business Interaction ABE::BusinessInteractionItem @since SID_R16.5
*/ 

public  class ServiceLevelAgreementItem extends AgreementItem,BusinessInteractionItem {



/**  
* Field serviceLevelSpecification
*/
protected List<ServiceLevelSpecification> serviceLevelSpecification ;


}