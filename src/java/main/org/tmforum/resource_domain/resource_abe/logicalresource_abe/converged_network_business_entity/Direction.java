/**
* Converged Network ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3.g.iI8G.v_E.eK5.fY.h.h4RE.fW.w-content.html">Converged Network ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.converged_network_business_entity ;

/**
* Represents the direction of flow in a TPE/LT with respect to the stack 
*  of layer protocols. 
 @since SID_R16.5
*/ 

public  enum Direction  {



/**  
* Field BIDIRECTIONAL
* Signal flow is both Client-Server and Server-Client. 

*/
 BIDIRECTIONAL ,




/**  
* Field CLIENT_SERVER
* Signal flows down the LT, e.g. traffic is taken from a number of low r 

* ate clients and multiplexed into a higher rate server. 

*/
 CLIENT_SERVER ,




/**  
* Field SERVER_CLIENT
* Signal flows up the LT. 

*/
 SERVER_CLIENT ,


}