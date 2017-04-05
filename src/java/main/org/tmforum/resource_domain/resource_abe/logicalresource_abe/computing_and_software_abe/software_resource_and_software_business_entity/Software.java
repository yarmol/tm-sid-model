/**
* Software Resource and Software ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_-.j.a.dQIYTE.eKS.k.uU.y3K96T.g-content.html">Software Resource and Software ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.computing_and_software_abe.software_resource_and_software_business_entity ;

/**
* A set of programs, procedures, functions and processes that are used b 
* y a Resource.Software may be nested within other software, thereby cre 
* ating a containment relationship. 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Computing and Software ABE::Software Resource and Software ABE::SoftwareResource" href="_.t.h.oI.gIYZE.eKS.k.uU.y3K96T.g-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Computing and Software ABE::Software Resource and Software ABE::SoftwareResource</a> |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class Software extends SoftwareResource,LogicalResource,Resource,Entity,RootEntity {



/**  
* Field isUTCTime
*/
protected Boolean isUTCTime ;




/**  
* Field lastStartTime
*/
protected DateTime lastStartTime ;




/**  
* Field numberProcessesActiveCurrent
*/
protected Integer numberProcessesActiveCurrent ;




/**  
* Field numUsersCurrent
* This is a non-negative integer that defines the current number of user 

* s of the Sofware. 

*/
protected Integer numUsersCurrent ;




/**  
* Field pagingFileSizeCurrent
*/
protected Quantity pagingFileSizeCurrent ;




/**  
* Field processMemorySizeCurrent
*/
protected Quantity processMemorySizeCurrent ;




/**  
* Field swapSpaceUsedCurrent
*/
protected Integer swapSpaceUsedCurrent ;




/**  
* Field softwareComposite
*/
protected SoftwareComposite softwareComposite ;




/**  
* Field software
*/
protected List<Software> software ;




/**  
* Field software2
*/
protected List<Software> software2 ;




/**  
* Field resourceElement
*/
protected List<ResourceElement> resourceElement ;




/**  
* Field runningSoftwareStatistics
*/
protected List<RunningSoftwareStatistic> runningSoftwareStatistics ;




/**  
* Field commonPlatformEnumeration
*/
protected CommonPlatformEnumeration commonPlatformEnumeration ;




/**  
* Field serialNumber
* A set of identifying characters and/or numbers assigned to, and usuall 

* y marked on, each of a series of identical Software instances. 

*/
protected String serialNumber ;




/**  
* Field resource
*/
protected Resource resource ;


}