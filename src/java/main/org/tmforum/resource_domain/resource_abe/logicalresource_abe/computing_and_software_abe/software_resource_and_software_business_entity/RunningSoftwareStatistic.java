/**
* Software Resource and Software ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_-.j.a.dQIYTE.eKS.k.uU.y3K96T.g-content.html">Software Resource and Software ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.computing_and_software_abe.software_resource_and_software_business_entity ;

/**
* A statisitic that documents the use of a Resource by Software that is  
* running. 
 @since SID_R16.5
*/ 

public  class RunningSoftwareStatistic  {



/**  
* Field runningSoftware
*/
protected List<RunningSoftwareStatistic> runningSoftware ;




/**  
* Field runningSoftware2
*/
protected List<RunningSoftwareStatistic> runningSoftware2 ;




/**  
* Field software
*/
protected Software software ;




/**  
* Field resourceUse
* The quantity (amount, units) of a Resource being used by Software. 

*/
protected Quantity resourceUse ;




/**  
* Field physicalComponent
*/
protected Resource physicalComponent ;




/**  
* Field useDateTime
* The date and time that the running Software is using a Resource. 

*/
protected TimePeriod useDateTime ;


}