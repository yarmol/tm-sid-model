/**
* Converged Network ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3.g.iI8G.v_E.eK5.fY.h.h4RE.fW.w-content.html">Converged Network ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.converged_network_business_entity ;

/**
* This defines the degree of internal resilience/protection of the FRE. 
 @since SID_R16.5
*/ 

public  enum InternalResilienceLevel  {



/**  
* Field FULLY_RESILIENT
* An FRE that will not fail if any single resource along its route fails 

*  (excluding the originating and terminating nodes for the FRE); for ex 

* ample, an FRE that is diversely routed. 

*/
 FULLY_RESILIENT ,




/**  
* Field HIGHLY_RESILIENT
* A higher level of resilient than is possible by simple diverse path ro 

* uting. A highly resilient FRE should be able to experience several fai 

* lures without affecting traffic. The alternative routes for the FRE ha 

* ve shared facilities and NEs other than potentially the originating an 

* d terminating NEs. Typically this is achieved using dual homing and la 

* dder style network construction with a combination of both protection  

* and restoration. 

*/
 HIGHLY_RESILIENT ,




/**  
* Field PARTIALLY_RESILIENT
* There is some resilience but the FRE route has at least one shared nod 

* e and/or shared link at some point in the overall FRE path. 

*/
 PARTIALLY_RESILIENT ,




/**  
* Field PREEMTIBLE
* May have resources taken to recover another FRE and hence may fail alt 

* hough no resources in the path chosen for the FRE have failed. 

*/
 PREEMTIBLE ,




/**  
* Field UNRESILIENT
* An FRE that will fail if any resources in its route fail. 

*/
 UNRESILIENT ,




/**  
* Field NULL
*/
 NULL ,


}