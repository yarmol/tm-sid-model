/**
* Protection ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.g.a1DIE.mXE.eCN.m.p.x.w.x3LZL.g-content.html">Protection ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.protection_business_entity ;

/**
* AUTOMATIC_SWITCH is used when the switch reason for the automatic swit 
* ch is not known. 
 @since SID_R16.5
*/ 

public  enum SwitchReason  {



/**  
* Field AUTOMATIC_SWITCH
* AUTOMATIC_SWITCH is used when the switch reason for the automatic swit 

* ch is not known. 

*/
 AUTOMATIC_SWITCH ,




/**  
* Field MANUAL
* MANUAL switch indicates that a manual operation caused this switch, in 

* cluding MANUAL, FORCED and LOCKOUT switches. 

*/
 MANUAL ,




/**  
* Field NOT_APPLICABLE
* NOT_APPLICABLE is used upon retrieval of switch data for non-revertive 

*  groups, if a more precise value is not available. 

*/
 NOT_APPLICABLE ,




/**  
* Field RESTORED
* RESTORED is used for revertive groups to indicate a return to the norm 

* al state. 

*/
 RESTORED ,




/**  
* Field SIGNAL_DEGRADE
*/
 SIGNAL_DEGRADE ,




/**  
* Field SIGNAL_FAIL
*/
 SIGNAL_FAIL ,




/**  
* Field SIGNAL_MISMATCH
* SIGNAL_MISMATCH is used in the case the signal is ok, but is identifie 

* d as coming from an incorrect source: TRAIL_TRACE_IDENTIFIER_MISMATCH, 

*  Signal Label Mismatch, etc.. 

*/
 SIGNAL_MISMATCH ,


}