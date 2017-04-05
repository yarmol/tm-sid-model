/**
* Business Objective ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_O.b.jJ4N0JE.d-.n.bO.r.i903.s7A-content.html">Business Objective ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.enterprise_domain.enterprise_effectiveness_abe.business_objective_business_entity ;

/**
* A formal and measurable objective a Party, playing a PartyRole, has re 
* garding that respective role. A BusinessObjective may represent an ato 
* mic business objective or consists of other business objectives. 
 @since SID_R16.5
*/ 

public  class BusinessObjective  {



/**  
* Field compositeBusinessObjective
*/
protected CompositeBusinessObjective compositeBusinessObjective ;




/**  
* Field partyRole
*/
protected List<PartyRole> partyRole ;




/**  
* Field validFor
*/
protected TimePeriod validFor ;




/**  
* Field businessObjectiveSpecification
*/
protected BusinessObjectiveSpecification businessObjectiveSpecification ;




/**  
* Field vision
*/
protected List<Vision> vision ;


}