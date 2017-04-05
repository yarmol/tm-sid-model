/**
* Protection ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.g.a1DIE.mXE.eCN.m.p.x.w.x3LZL.g-content.html">Protection ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.protection_business_entity ;

/**
* This data type identifies the current protection switch status of a Pr 
* otection Group or an SNCP reliable CTP. See supporting document SD1-34 
* _protectionSwitch. 
 @since SID_R16.5
*/ 

public  class SwitchData  {



/**  
* Field protectionType
* This attribute identifies the type of the protection for which the swi 

* tch has occurred. 

*/
protected ProtectionType protectionType ;




/**  
* Field switchReason
* This attribute contains the reason of the last switch. During a switch 

*  notification the switch reason is known. If it is not cached in the t 

* arget OS for later retrieval, then a NOT_APPLICABLE value is assigned. 

*/
protected SwitchReason switchReason ;




/**  
* Field layerRate
* This attribute identifies the layer at which the switch has occurred.  

* The Layer Rate can be used to filter the switch notification. 

*/
protected LayerRate layerRate ;




/**  
* Field pgRef
* This attribute identifies the Protection Group in case of a trail prot 

* ection switch. This is empty, if the protection type is SNCP. 

*/
protected ObjectName pgRef ;




/**  
* Field protectedTpRef
* This attribute contains the name of the TP that is protected. The prot 

* ected (worker) and protecting TPs are fixed in a revertive Protection  

* Group, the worker can be active or not at any point in time. In a non- 

* revertive Protection Group, there is no fixed worker / protecting dist 

* inction. The worker TP is indeed always the active TP; after a switch, 

*  the worker and protecting TPs exchange their roles.</br>- For an SNCP 

* , this is always the reliable TP.</br>- For a retrieval of a 2F BLSR,  

* each TP is protected, and two SwitchData instances are returned.</br>- 

*  For a retrieval of a 4FMSSPR, each worker TP is protected, and two Sw 

* itchData instances are returned.</br>- For a retrieval of a 1:N trail  

* protection (e.g. MSP), each worker TP is protected, and N SwitchData i 

* nstances are returned.</br>- For a retrieval of a revertive 1+1 trail  

* protection (e.g. MSP), this is always the worker TP.</br>- For a retri 

* eval of a non-revertive 1+1 trail protection (e.g. MSP) switch, this i 

* s the active TP.</br>- This TP is a CTP for SNCP and a PTP for trail p 

* rotection schemes. 

*/
protected ObjectName protectedTpRef ;




/**  
* Field switchToTpRef
* This attribute identifies the TP which is being switched to and is the 

*  active source after the switch.</br>This TP is a CTP for SNCP and a P 

* TP for trail protection schemes. 

*/
protected ObjectName switchToTpRef ;




/**  
* Field protectedTpeRef
*/
protected TerminationPointEncapsulation protectedTpeRef ;




/**  
* Field switchToTpeRef
*/
protected TerminationPointEncapsulation switchToTpeRef ;


}