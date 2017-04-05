/**
* Network Function ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.dQPT.gHPZE.eSII8.f.s.sZ.y.cKQ-content.html">Network Function ABE</a> 
* The Network Function ABE contains entities that are used to represent  
* Network Function as a Functional Block (FB) within a network infrastru 
* cture which has well-defined external interfaces and well-defined func 
* tional behavior. Network Functions can be physical (PNF) or virtual (V 
* NF). 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.network_function_business_entity ;

/**
* A NetworkFunctionComposite is collection of Atomic and Composite Netwo 
* rk Functions. 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::Network Function ABE::NetworkFunction" href="_.bQ.u.dYHP.aE.eSII8.f.s.sZ.y.cKQ-content.html">SID Models::Resource Domain::Resource ABE::Network Function ABE::NetworkFunction</a> |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class NetworkFunctionComposite extends NetworkFunction,Resource,Entity,RootEntity {



/**  
* Field networkFunction
*/
protected NetworkFunction networkFunction ;


}