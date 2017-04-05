/**
* Network ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E2C322B0390-content.html">Network ABE</a> 
* The Resource ABE contains entities that are used to represent the vari 
* ous aspects of a Resource. These can be divided into four basic types  
* of entities.The first two, PhysicalResource and LogicalResource, are s 
* ets of entities that represent the physical and logical aspects of a R 
* esource, respectively. This is important to enable the SID to build a  
* set of reusable managed entities that can be used to model the physica 
* l and logical aspects of different types of Resources.The third type o 
* f entity, CompoundResource, is a set of entities that shows how to agg 
* regate PhysicalResources and LogicalResources into aggregate entities  
* that has physical and logical characteristics and behavior. This enabl 
* es designers to represent Resources that have physical and logical cha 
* racteristics and behavior as a single entity.The fourth type of entity 
* , Network, is a set of entities that shows how to represent networks,  
* sub-networks, network components, and other related aspects of a netwo 
* rk. This type of entity builds on the notion of a CompoundResource by  
* aggregating CompoundResources into a functional whole. 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.network_business_entity ;

/**
* The Network class is derived from M.3100.A Network is a managed object 
*  that represents an aggregation of interconnected telecommunications a 
* nd management objects capable of exchanging information. The reason th 
* at a Network is subclassed from ResourceCollection is that it is impor 
* tant that a Network be able to represent physical as well as logical c 
* haracteristics and behavior of this collection of telecommunications a 
* nd management objects.A Network has the additional semantics of having 
*  one or more common characteristics and/or behavior. For example, a ne 
* twork may be owned by a single customer or provider, or be associated  
* with the delivery of a specific set of services. A network may be nest 
* ed within another (larger) network, thereby forming a containment rela 
* tionship. An example of a network that is contained in another network 
*  is a transmission sub-network. It is owned by a single Administration 
*  and can only perform transmission functions.The m.3100 SystemTitle at 
* tribute is NOT implemented in this class, we're using UserLabel instea 
* d.Note that the LocationName attribute of m.3100 and MTNM is NOT imple 
* mented in this class, but rather is defined through an association to  
* the Location object class in order to represent more generic types of  
* associations.The MTNM managedElementName, nativeEMSName, communucation 
* State, and emsInSyncState attributes are NOT implemented in this class 
* , as all SHOULD be derived from the ManagedDevices association. Note t 
* hat there can be multiple EMSes that manage any given ManagedElement.T 
* he MTNM owner attribute is NOT implemented in this class, as it is der 
* ived from the MEOwner association. Note that there can be multiple own 
* ers for any given ManagedElement.The MTNM connectionRate attribute is  
* NOT implemented in this class, as not all ManagedElements have the abi 
* lity to communicate.The MTNM softwareVersion attribute is NOT implemen 
* ted in this class, as not all ManagedElements have software associated 
*  with them. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::CompoundResource ABE::ResourceCollection |- 
 SID Models::Resource Domain::Resource ABE::CompoundResource ABE::CompoundResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class Network extends ResourceCollection,CompoundResource,Resource,Entity,RootEntity {



/**  
* Field networkAdministrativeState
* This attribute is an enumerated integer that defines the administrativ 

* e state of the Network. Values include:</br></br> 0: Unknown</br> 1: U 

* nlocked</br> 2: Locked</br> 3: Shutting Down</br> 4: Starting Up</br>  

* 5: Testing</br> 6: Maintenance</br> 

*/
protected Integer networkAdministrativeState ;




/**  
* Field networkAlarmStatus
* This is an enumerated integer that indicates the occurrence of an abno 

* rmal condition relating to one or more managed objects that are contai 

* ned in this Network. This attribute may also function as a summary ind 

* icator of alarm conditions associated with a specific resource. It is  

* used to indicate the existence of an alarm condition, a pending alarm  

* condition such as threshold situations, or (when used as a summary ind 

* icator) the highest severity of active alarm conditions. Values includ 

* e:</br></br> 0: unknown error</br> 1: active - Critical</br> 2: active 

*  - Major</br> 3: active - Minor</br> 4: active - Indeterminate</br> 5: 

*  active - Warning</br> 6: active - PendingDecision </br> 7: active - U 

* nderRepair</br> 8: active - BeingReplaced</br> 9: cleared</br> 

*/
protected Integer networkAlarmStatus ;




/**  
* Field isNetworkOperational
* This attribute is used to define the operational status of the Network 

* , and is implemented as a Boolean: TRUE means that the Network is curr 

* ently operational, and FALSE means that the Network is not currently o 

* perational. 

*/
protected Boolean isNetworkOperational ;




/**  
* Field layerRates
* This is a comma-separated Sequence of string attributes. Each string i 

* dentifies a communication rate that is supported by this Network. 

*/
protected String layerRates ;




/**  
* Field physicalPort
*/
protected PhysicalPort physicalPort ;




/**  
* Field networkComposite
*/
protected NetworkComposite networkComposite ;




/**  
* Field physicalResource
*/
protected PhysicalResource physicalResource ;




/**  
* Field logicalResource
*/
protected LogicalResource logicalResource ;


}