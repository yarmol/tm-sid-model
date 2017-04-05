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

import org.tmforum.common_business_entities_domain.base_types_business_entity.TimePeriod;
import org.tmforum.common_business_entities_domain.business_interaction_business_entity.BusinessInteraction;
import org.tmforum.common_business_entities_domain.calendar_business_entity.Appointment;
import org.tmforum.engaged_party_domain.party_revenue_abe.party_settlement_business_entity.PartySettlement;

import java.util.List;

/**
* A type of BusinessInteraction that represents a contract or arrangemen 
* t, either written or verbal and sometimes enforceable by law. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Business Interaction ABE::BusinessInteraction @since SID_R16.5
*/ 

public  class Agreement extends BusinessInteraction {



/**  
* Field agreementDocumentNumber
* A reference number assigned to an Agreement that follows a prescribed  

* numbering system. 

*/
protected String agreementDocumentNumber ;




/**  
* Field agreementStatementOfIntent
* An overview and goals of the Agreement. 

*/
protected String agreementStatementOfIntent ;




/**  
* Field agreementPeriod
* The time period during which the Agreement is in effect. 

*/
protected TimePeriod agreementPeriod ;




/**  
* Field agreementItem
*/
protected List<AgreementItem> agreementItem ;




/**  
* Field agreementTermOrCondition
*/
protected List<AgreementTermOrCondition> agreementTermOrCondition ;




/**  
* Field agreementApproval
*/
protected List<AgreementApproval> agreementApproval ;




/**  
* Field appointment
*/
protected List<Appointment> appointment ;




/**  
* Field partySettlement
*/
protected List<PartySettlement> partySettlement ;


}