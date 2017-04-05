/**
* WorkSpecification ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_I1020N.mZE.eC.z9.a.o.eR.f.u.g.hA-content.html">WorkSpecification ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.enterprise_domain.workforce_abe.workspecification_business_entity ;

/**
* Entity that is used in Planning and WorkSpecification configuration. R 
* epresents a rate that shows how many particular work tasks (quantity a 
* ttribute) can be performed by a given organization in a given location 
*  (or serving areas) with a given capacity (Consumption Capacity attrib 
* ute). For example, with 100 man hours of Fiber layout skills, 200 work 
* s of “Dig a trench for Underground Cable, 200m length” can be performe 
* d in an urban area by an organization. 
 @since SID_R16.5
*/ 

public  class WorkSpecFulfillmentRate  {



/**  
* Field workSpecification
*/
protected WorkSpecification workSpecification ;




/**  
* Field place
*/
protected Place place ;




/**  
* Field workforceOrganizationRole
*/
protected WorkforceOrganizationRole workforceOrganizationRole ;




/**  
* Field quantity
* Maximal number of identical work tasks (defined by WorkSpecification)  

* that the organization can do for the location, using the available cap 

* acity, at the same time 

*/
protected Quantity quantity ;




/**  
* Field consumptionCapacity
* Workforce capacity that is required by the work to be done for the loc 

* ation, and that the organization can supply. Unit of the value can be  

* man hour, man day, etc 

*/
protected Integer consumptionCapacity ;




/**  
* Field standardDrivingTime
* Standard driving time for the organization’s technicians to drive to a 

* nd between work places in the serving area 

*/
protected Integer standardDrivingTime ;


}