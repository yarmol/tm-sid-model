/**
* Converged Network ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3.g.iI8G.v_E.eK5.fY.h.h4RE.fW.w-content.html">Converged Network ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.converged_network_business_entity ;

/**
* Indicates to what degree the management system and other system in the 
*  network are in control of the setup and routing of the FRE.  
 @since SID_R16.5
*/ 

public  enum ConnectionSetupType  {



/**  
* Field PC
* "Permanent Circuit" essentially indicates that the management system i 

* s in control and that what the management system dictates will not be  

* changed by any other component in the network. 

*/
 PC ,




/**  
* Field SC
* "Switched Circuit" essentially indicates that the network is in contro 

* l and that the management system is a slave to network control. 

*/
 SC ,




/**  
* Field SPC
* "Semi-Permanent Circuit" where the management system can setup the FRE 

*  but the network will deal with the routing. 

*/
 SPC ,


}