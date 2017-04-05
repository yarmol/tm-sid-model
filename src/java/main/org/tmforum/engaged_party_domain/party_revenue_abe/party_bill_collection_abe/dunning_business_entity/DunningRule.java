/**
* Dunning ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.a.i.f.w.wE4.cE.eO_X.pEX.s37Q.e.w-content.html">Dunning ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_revenue_abe.party_bill_collection_abe.dunning_business_entity ;

/**
* A DunningRule is a type of PolicyRule.It represents rules to apply to  
* a dunning case: the events that trigger dunning rules evaluation, the  
* conditions to evaluate and the actions that must be done (Ex: SMS, let 
* ters, outbound calls, barring/unbarring actions, late fees, penalties… 
* ) 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::Policy ABE::PolicyRule |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::PolicyRuleBase |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::PolicySet |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::Policy |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class DunningRule extends PolicyRule,PolicyRuleBase,PolicySet,Policy,RootEntity {



/**  
* Field dunningScenario
*/
protected List<DunningScenario> dunningScenario ;




/**  
* Field dunningCaseRule
*/
protected List<DunningCaseRule> dunningCaseRule ;


}