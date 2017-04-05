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
* An Autonomous System (AS) provides a structured view of routing by seg 
* regating the system that is using routing (e.g., the Internet, a corpo 
* rate intranet, or a company extranet) into a set of separately adminis 
* tered domains that each has their own independent routing policies.The 
*  classic definition of an AS, from RFC1771, is '...a set of routers un 
* der a single technical administration, using an interior gateway proto 
* col and common metrics to route packets within the AS, and using an ex 
* terior gateway protocol to route packets to other ASs. Since this clas 
* sic definition was developed, it has become common for a single AS to  
* use several interior gateway protocols and sometimes several sets of m 
* etrics within an AS. The use of the term Autonomous System here stress 
* es the fact that, even when multiple IGPs and metrics are used, the ad 
* ministration of an AS appears to other ASs to have a single coherent i 
* nterior routing plan and presents a consistent picture of what destina 
* tions are reachable through it.' 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Network ABE::NetworkDomain" href="_3E3F0EC000E93CDDD36401F6-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Network ABE::NetworkDomain</a> |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::ManagementDomain |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class AutonomousSystem extends NetworkDomain,ManagementDomain,RootEntity {



/**  
* Field asNumber
* This is an integer between 1 and 65535, with the range 64512 through 6 

* 5535 reserved for private use. Every AS has a unique AS number, which  

* is assigned to it by an Internet Registry or a provider. IANA assigns  

* and administers AS numbers. 

*/
protected Integer asNumber ;




/**  
* Field isSingleHomed
* This is a boolean that, when its value is TRUE, indicates that this AS 

*  reaches networks outside of its domain through a single exit point. W 

* hether a given AS is single-homed or not has important ramifications f 

* or BGP configuration. 

*/
protected Boolean isSingleHomed ;




/**  
* Field isTransitRouter
* This is a boolean that, when its value is TRUE, indicates that this AS 

*  will advertise routes that it learns from other ASs. A non-transit AS 

*  will only advertise its own routes. 

*/
protected Boolean isTransitRouter ;




/**  
* Field requiresIGPSync
* This is a boolean that, when its value is TRUE, indicates that this AS 

*  must obey the following BGP rule: a BGP router should not advertise d 

* estinations learned from internal BGP neighbors to external BGP destin 

* ations unless those destinations are also known via some internal gate 

* way protocol. Otherwise, a BGP router may receive traffic that cannot  

* yet be routed. However, since this is a costly choice, it is common pr 

* actice to allow this rule to be broken under certain carefully control 

* led circumstances. 

*/
protected Boolean requiresIGPSync ;




/**  
* Field routingUpdateMethod
* This defines how routing information is to be injected. Statically inj 

* ected routes are maintained by the routing table and are independent o 

* f the status of the networks that they refer to. This is done by defin 

* ing static routes in the routing table. Dynamically injected routes ar 

* e of two types. Dynamic routes refer to distributing all of the IGP ro 

* utes into the AS. Semi-dynamic routes define a set of specific IGP rou 

* tes that will be injected into the AS. Values include:</br></br> 0: Un 

* known</br> 1: Static</br> 2: Dynamic</br> 3: Semi-Dynamic</br> 

*/
protected Integer routingUpdateMethod ;




/**  
* Field routeAggregationMethod
* This refers to summarizing ranges of routes into one or more aggregate 

*  routes. This is done to minimize the number of routes in the global r 

* outing table. A potential drawback is that specific path information ( 

* e.g., AS_Path attribute value) is lost, which may lead to potential ro 

* uting loops. There are a variety of ways to ensure that this does not  

* happen. Note, however, that BGP4 is required to do this.</br></br>Ther 

* e are many ways to form aggregate routes. The following are the most p 

* opular: 'Aggregate only', where only the aggregate is advertised, and  

* all of its more specific routes are suppressed; 'Aggregate and Include 

*  Specific Routes', where both the aggregate as well as its more specif 

* ic routes are advertised (e.g., send the aggregate to the NAP, but sen 

* d the more specific routes to providers); 'Aggregate Based on a Subset 

*  of Specific Routes', where the aggregate route is formed by looking a 

* t certain more specific routes and forming an aggregate on them, suppr 

* essing all others. Values include:</br></br> 0: Unknown</br> 1: None</ 

* br> 2: Aggregate Only </br> 3: Aggregate and Include Specific Routes</ 

* br> 4: Aggregate Based on Subset of Specific Routes</br> 

*/
protected Integer routeAggregationMethod ;


}