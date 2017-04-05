/**
* Converged Network ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3.g.iI8G.v_E.eK5.fY.h.h4RE.fW.w-content.html">Converged Network ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.converged_network_business_entity ;

/**
* Extensible list of possible TPE ID types (name spaces). 
 @since SID_R16.5
*/ 

public  enum TpeIdType  {



/**  
* Field ABSTRACT_SNP
* The name of a virtualized TPE in an ASON context such as an SNP or SNP 

* P. 

*/
 ABSTRACT_SNP ,




/**  
* Field CONCRETE
* TPE in a physical/NE environment. Equivalent to the PTP/CTP/FTP names. 

*/
 CONCRETE ,




/**  
* Field TNA_ADDRESS
* The name of a TPE in the highly abstracted and opaque context of Trans 

* port Network Assigned addresses (ASON). 

*/
 TNA_ADDRESS ,


}