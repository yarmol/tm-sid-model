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
* A Local Area Network is a computer network covering a specific local a 
* rea, like a home, office or small group of buildings. It provides comm 
* unication between computers and devices.The topology of a network dict 
* ates its physical structure.  

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Network ABE::NetworkComposite" href="_3E3F0EC000E9431A15120165-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Network ABE::NetworkComposite</a> |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Network ABE::Network" href="_3E3F0EC000E93CDDD46B03BF-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Network ABE::Network</a> |- 
 SID Models::Resource Domain::Resource ABE::CompoundResource ABE::ResourceCollection |- 
 SID Models::Resource Domain::Resource ABE::CompoundResource ABE::CompoundResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class LAN extends NetworkComposite,Network,ResourceCollection,CompoundResource,Resource,Entity,RootEntity {



/**  
* Field lanID
* This is a label or identifier for the LAN. 

*/
protected String lanID ;




/**  
* Field lanType
* This is an enumerated integer, and is an indication of the kind of tec 

* hnology used on the LAN. Values include:</br></br> 0: Unknown</br> 1:  

* Ethernet</br> 2: FastEthernet</br> 3: GigabitEthernet</br> 4: 10 Gigab 

* itEthernet</br> 5: TokenRing</br> 6: FDDI</br></br>Note that FastEther 

* net is also able to run at Ethernet speeds if CanAutoSense is TRUE.</b 

* r> 

*/
protected Integer lanType ;




/**  
* Field canAutoSense
* This is a Boolean that, if TRUE, means that every ManagedElement in th 

* e LAN can sense what speed the LAN is running at and adjust accordingl 

* y. FALSE means that this capability is NOT shared by every element, an 

* d so a speed must be chosen at startup time. 

*/
protected Boolean canAutoSense ;


}