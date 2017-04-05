/**
* Converged Network ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3.g.iI8G.v_E.eK5.fY.h.h4RE.fW.w-content.html">Converged Network ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.converged_network_business_entity ;

/**
* Package of attributes that relate to internal resilience of the FRE. 
 @since SID_R16.5
*/ 

public  class FreProtection  {



/**  
* Field priority
* This attribute identifies the priority of the FRE. Allowed values are  

* = "0" , "1" , "2" , ... where zero (0) is the highest priority. 

*/
protected Integer priority ;




/**  
* Field protectionEffort
* This attribute indicates the degree to which  the level of protection  

* specified in staticProtectionLevel needs to be met. The attribute appi 

* es during initial routing and rerouting. 

*/
protected ProtectionEffort protectionEffort ;




/**  
* Field rerouteAllowed
* This attribute specifies if the target system (e.g. OS, Control Plane, 

*  and ME) is allowed and/or required to reroute this FRE if there is a  

* failure on this FRE, periodically to optimize the routes, or for any o 

* ther reason. It is a target system implementation whether this is done 

*  using network routing protocols or if the target system detects the f 

* ailure and takes appropriate action to attempt to fix the FRE. </br></ 

* br>The NO value means that the target system is not allowed to reroute 

*  the FRE. </br></br>The YES value means that the target system is allo 

* wed to reroute the FRE and is required to attempt to reroute it upon f 

* ailure. </br></br>The NOT_APPLICABLE value is used when the requesting 

*  OS does not want to specify the exact target system behaviour. In thi 

* s case it is left up to the target system to decide whether rerouting  

* will be provided. It is also used if the target system is allowed to r 

* eroute the FRE but not required to attempt to reroute it upon failure. 

*/
protected RerouteAllowed rerouteAllowed ;




/**  
* Field isRevertive
* An FRE that is resilient may have a preferred route (intended route or 

*  home route). </br></br>In the case where the FRE is "revertive" (True 

* ) if the FRE is using an alternative route to the preferred route and  

* the prefered route is not locked the restoration process will revert t 

* o the prefered route (from the alternative) once there are no relevant 

*  problems detected on the prefered route. 

*/
protected Boolean isRevertive ;




/**  
* Field internalResilience
* This attribute indicates the degree of internal resilience/protection  

* of the FRE. 

*/
protected InternalResilienceLevel internalResilience ;


}