/**
* CompoundResource ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93EF8CA2200A3-content.html">CompoundResource ABE</a> 
* The Resource ABE contains entities that are used to represent the vari 
* ous aspects of a Resource.CompoundResource is a set of entities that s 
* hows how to aggregate PhysicalResources and LogicalResources into aggr 
* egate entities that has physical and logical characteristics and behav 
* ior. This enables designers to represent Resources that have physical  
* and logical characteristics and behavior as a single entity. 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.compoundresource_business_entity ;

/**
* This is the abstract base class for all composite entities that are in 
* herently manageable and make up a Product. The key difference between  
* Resource and CompoundResource is that Resource describes either a Phys 
* ical or a Logical entity (through its PhysicalResource and LogicalReso 
* urce hierarchies). In contrast, CompoundResource is used to describe m 
* anaged entities that are collections of other managed entities. A key  
* point is that each managed entity that is part of a CompoundResource c 
* an be individually managed as either a PhysicalResource or a LogicalRe 
* source. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class CompoundResource extends Resource,Entity,RootEntity {



/**  
* Field networkDomain
*/
protected List<NetworkDomain> networkDomain ;




/**  
* Field resourceElement
*/
protected ResourceCollection resourceElement ;




/**  
* Field compoundResourceRole
*/
protected List<CompoundResourceRole> compoundResourceRole ;




/**  
* Field crStatus
* This is an enumerated integer whose value indicates the current status 

*  of the object. The following values are defined:</br></br> 0: Unknown 

* </br> 1: OK</br> 2: Initializing</br> 3: Starting</br> 4: Paused</br>  

* 5: Stopping</br> 6: Stopped</br> 7: Degraded</br> 8: Stressed </br> 9: 

*  Predicted Failure</br> 10: Error - General</br> 11: Error - Non Recov 

* erable</br> 12: Not Installed or Not Present</br> 13: In Maintenance</ 

* br> 14: Unable To Contact</br> 15: Lost Communications</br></br>Stoppe 

* d indicates that the CompoundResource is known to still exist, but it  

* is no longer operational. However, it has not failed.</br> </br>Stress 

* ed indicates that the LogicalResource is functioning, but needs attent 

* ion (e.g., it may be overheating, or overloaded in some way). This is  

* similar to Predicted Failure, which indicates that this CompoundResour 

* ce is functioning properly, but is predicting a failure in the near fu 

* ture.</br></br>In Maintenance indicates that this LogicalResource is b 

* eing configured, maintained, or otherwise administered and is NOT avai 

* lable for service.</br> 

*/
protected Integer crStatus ;




/**  
* Field resource
*/
protected List<Resource> resource ;


}