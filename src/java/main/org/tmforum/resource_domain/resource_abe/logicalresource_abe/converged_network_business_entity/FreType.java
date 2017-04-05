/**
* Converged Network ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3.g.iI8G.v_E.eK5.fY.h.h4RE.fW.w-content.html">Converged Network ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.converged_network_business_entity ;

/**
* Extensible list of FreTypes that provide details of the visible abstra 
* ction of the internal structure of the encapsulation, i.e. that that c 
* an be seen and controlled via the FRE. 
 @since SID_R16.5
*/ 

public  enum FreType  {



/**  
* Field DOUBLE_INTERCONNECT
* The FRE has four points and is equivalent an INTERCONNECT for both A t 

* o Z and Z to A directions. 

*/
 DOUBLE_INTERCONNECT ,




/**  
* Field DOUBLE_PROTECTED
* The FRE has four EndPoints all of which are RESILIENT in two groups wh 

* ere each group has two members. This is essentially the combination of 

*  two PROTECTED FREs. 

*/
 DOUBLE_PROTECTED ,




/**  
* Field EXPLICIT
* The FRE is described in terms of explicit flows.Note: It is expected t 

* hat this option will be removed and replace with the extensibility opt 

* ion to add new freTypes and associated spec details. 

*/
 EXPLICIT ,




/**  
* Field HUB_AND_SPOKE
* The FRE has many EndPoints. Some points take a HUB role and some a SPO 

* KE role. This is essentially the Point to Multi-point configuration.Th 

* e Hubs forward to (and from) all other points (including HUBs).The SPO 

* KES only forward to and from HUBs. 

*/
 HUB_AND_SPOKE ,




/**  
* Field INTERCONNECT
* The FRE has three EndPoints, and is equivalent to a unidirectional ADD 

* _DROP_A (two A EndPoints and one Z EndPoint) with signal flowing from  

* A to Z but with the addition of a flow from A1 to A2 and a flow from Z 

* 1 to A1. 

*/
 INTERCONNECT ,




/**  
* Field MULTIPOINT
* The FRE has many EndPoints and there are no forwarding restrictions. T 

* he point role is SYMMETRIC for all endpoints. 

*/
 MULTIPOINT ,




/**  
* Field OPEN_PROTECTED
* The FRE has four EndPoints, two As and two Zs and is essentially the c 

* ombination of an ADD_DROP_A and and ADD_DROP_Z but only the A1 and Z1  

* are protected, A2 and Z2 only derived signal from Z1 and A1 respective 

* ly. 

*/
 OPEN_PROTECTED ,




/**  
* Field POINT_TO_POINT
* The FRE has two EndPoints only and forwarding takes place between them 

*  as dictated by directionality. 

*/
 POINT_TO_POINT ,




/**  
* Field PROTECTED
* The FRE has three EndPoints where in one direction of forwarding two o 

* f the EndPoints (taking a PROTECTING role) make signal available to th 

* e third EndPoint (taking a RESILIENT role) so as to provide resilience 

*  and in the other direction the RESILEINT point provide signal to the  

* two PROTECTING point). 

*/
 PROTECTED ,


}