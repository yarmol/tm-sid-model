/**
* Network Service ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_DQ.a3UHP.gE.eSII8.f.s.sZ.y.cKQ-content.html">Network Service ABE</a> 
* The Network Service ABE contains entities that are used to represent t 
* he set of Network Functions required to support a particular Service. 
* @since SID_R16.5
*/

package org.tmforum.service_domain.service_abe.network_service_business_entity ;

/**
* A NetworkServiceComposite is collection of Atomic and Composite Networ 
* k Services. 

Inheritance tree: |- 
 <a title="SID Models::Service Domain::Service ABE::Network Service ABE::NetworkService" href="_L.y.b7.sHP.gE.eSII8.f.s.sZ.y.cKQ-content.html">SID Models::Service Domain::Service ABE::Network Service ABE::NetworkService</a> |- 
 SID Models::Service Domain::Service ABE::Service |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class NetworkServiceComposite extends NetworkService,Service,Entity,RootEntity {



/**  
* Field componentNS
*/
protected NetworkService componentNS ;


}