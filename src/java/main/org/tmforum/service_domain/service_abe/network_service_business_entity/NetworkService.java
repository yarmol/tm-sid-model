/**
* Network Service ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_DQ.a3UHP.gE.eSII8.f.s.sZ.y.cKQ-content.html">Network Service ABE</a> 
* The Network Service ABE contains entities that are used to represent t 
* he set of Network Functions required to support a particular Service. 
* @since SID_R16.5
*/

package org.tmforum.service_domain.service_abe.network_service_business_entity ;

import org.tmforum.common_business_entities_domain.root_business_entities_business_entity.Entity;
import org.tmforum.common_business_entities_domain.root_business_entities_business_entity.RootEntity;
import org.tmforum.resource_domain.resource_abe.network_function_business_entity.NetworkFunction;
import org.tmforum.service_domain.service_abe.customer_facing_service_business_entity.CustomerFacingService;
import org.tmforum.service_domain.service_abe.resource_facing_service_business_entity.ResourceFacingService;
import org.tmforum.service_domain.service_business_entity.Service;

import java.util.List;

/**
* A Network Service is a composition of Network Functions and defined by 
*  its functional and behavioural specification.Note: a CFS can be suppo 
* rted by a combination of RFSs and NSs but it should be supported by at 
*  least one. 

Inheritance tree: |- 
 SID Models::Service Domain::Service ABE::Service |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class NetworkService extends Service,Entity,RootEntity {



/**  
* Field cfs
*/
protected List<CustomerFacingService> cfs ;




/**  
* Field networkFunction
*/
protected NetworkFunction networkFunction ;




/**  
* Field aggNS
*/
protected NetworkServiceComposite aggNS ;




/**  
* Field forwardingGraph
*/
protected List<ForwardingGraph> forwardingGraph ;




/**  
* Field rfs
*/
protected List<ResourceFacingService> rfs ;


}