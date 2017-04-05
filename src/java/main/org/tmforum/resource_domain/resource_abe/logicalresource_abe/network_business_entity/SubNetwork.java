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
* The SubNetwork class is derived from MTNM; please note that this defin 
* ition is subtlely different than that of G.805. MTNM defines a subnetw 
* ork as an abstraction provided by the EMS to the NMS that describes th 
* e potential for subnetwork connections. (An MTNM SubNetworkConnection  
* relates end-point TerminationPoints. It provides a transparent end-to- 
* end connection or a trail (closed or half-open) through a Subnetwork a 
* ccording to the roles associated to its end points.)The SID uses the a 
* bove MTNM definition and expands on it. It defines a SubNetwork as exi 
* sting within a single layer network. It is defined by the set of Resou 
* rcePorts that are available for the purpose of transferring characteri 
* stic information. The associations between the ResourcePorts at the ed 
* ge of a SubNetwork may be made and broken by a LayerNetwork management 
*  process, thus changing its connectivity. When a SubNetwork connection 
*  is established, the reference points are also created by binding the  
* ports to input and output of the SubNetwork connection. In general, Su 
* bNetworks may be partitioned into smaller SubNetworks interconnected b 
* y links. 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Network ABE::Network" href="_3E3F0EC000E93CDDD46B03BF-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Network ABE::Network</a> |- 
 SID Models::Resource Domain::Resource ABE::CompoundResource ABE::ResourceCollection |- 
 SID Models::Resource Domain::Resource ABE::CompoundResource ABE::CompoundResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class SubNetwork extends Network,ResourceCollection,CompoundResource,Resource,Entity,RootEntity {



/**  
* Field connectionRates
* This is a comma-separated Sequence of string attributes. Each string i 

* dentifies a connection rate that is supported by this Network. Connect 

* ion rates can operate at a speed that is different from the overall ra 

* te of the network that contains this SubNetwork.</br></br>Values are d 

* efined by the LayerRates supporting document in the MTNM specification 

* .</br> 

*/
protected String connectionRates ;




/**  
* Field subNetworkType
* This is an enumerated integer that defines the specific type of SubNet 

* work that this instance is.</br></br>The following values are defined  

* by TMF608:</br></br> 0: Singleton</br> 1: CHAIN</br> 2: PSR</br> 3: SP 

* RING</br> 4: OPEN_PSR</br> 5: OPEN_SPRING</br> 6: MESH</br> 

*/
protected Integer subNetworkType ;




/**  
* Field layerNetwork
*/
protected LayerNetwork layerNetwork ;




/**  
* Field pipe
*/
protected Pipe pipe ;




/**  
* Field subNetwork
*/
protected List<SubNetwork> subNetwork ;




/**  
* Field subNetwork1
*/
protected SubNetwork subNetwork1 ;


}