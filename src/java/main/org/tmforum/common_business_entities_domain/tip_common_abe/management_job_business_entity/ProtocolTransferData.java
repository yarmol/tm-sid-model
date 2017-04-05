/**
* Management Job ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_Q.u.e.s0N.u.tE.eGD0K.rE.cT.g.u.rQ-content.html">Management Job ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.tip_common_abe.management_job_business_entity ;

/**
* Defines the information required for a data transfer. It contains info 
* rmation needed for the data transfer, but it does not contain result i 
* nformation, i.e. the list of file produced is not part of this object  
* nor of its descendants.This class acts as a base class for all types o 
* f possible data transfers even if currently only File Transfer is supp 
* orted. 
 @since SID_R16.5
*/ 

public abstract class ProtocolTransferData  {



/**  
* Field transportProtocol
* The protocol that is used to transfer the requested data between the p 

* articipating applications. 

*/
protected String transportProtocol ;


}