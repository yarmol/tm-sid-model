/**
* Framework ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3.oGG8J2HE.d6.kLP.pR.s.o.rX-.w-content.html">Framework ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.tip_common_abe.framework_business_entity ;

/**
* This object class defines the common attributes for all addressable ob 
* ject classes used in the MTOSI/MTNM interface. This class should “merg 
* e up” into its parent class. There is currently no merge-up stereotype 
*  to direct the implementation so the class has not been decorated. 
 @since SID_R16.5
*/ 

public  class CommonObjectInfo  {



/**  
* Field userLabel
* This attribute represents a provisionable, user friendly name for the  

* object. The userLabel attribute is owned and may be set by the request 

* ing OS or the naming OS. </br>The difference between the userLabel and 

*  the name is that the userLabel is an attribute of the object that may 

*  be "set" by the requesting OS or the naming OS. </br>This attribute m 

* ay be unique amongst all instances of this object in the target OS. 

*/
protected String userLabel ;




/**  
* Field owner
* This attribute represents an identifier for the owner of the object. < 

* /br>Used and controlled (write-access) by the requesting OS only. </br 

* >See R_TMF518_FMW_I_0001.This attribute represents an identifier for t 

* he owner of the object. 

*/
protected String owner ;




/**  
* Field nativeEmsName
* This attribute contains the native EMS Name of the object. It represen 

* ts how an EMS user addresses an object on the EMS GUI. Its aim is to p 

* rovide a "nomenclature bridge" for relating information presented on N 

* MS displays and EMS displays (via GUI cut through). </br>The EMS may o 

* r may not support changing this value.This attribute contains a list o 

* f aliases for the entity. 

*/
protected String nativeEmsName ;




/**  
* Field namingOsRef
* This attribute represents an identifier for the steward of the object. 

*  </br>See R_TMF518_FMW_I_0001.This attribute represents an identifier  

* for the steward of the object, intended as the OS that sets the name o 

* f the object. The namingOS attribute is set by the OS that is responsi 

* ble for setting the "name" of the object. 

*/
protected String namingOsRef ;




/**  
* Field name
* This attribute represents a unique identifier for the object on the CC 

* V within the context of the OS that creates the object. </br>See R_TMF 

* 518_FMW_I_0001, R_TMF518_FMW_I_0002, R_TMF518_FMW_I_0003 and R_TMF518_ 

* FMW_I_0006.This attribute represents a unique identifier of the object 

*  on the CCV within the context of the OS that creates the object. </br 

* >For object naming see also attached supporting document SD2-7_ObjectN 

* aming. </br> </br>Traceability: R_TMF518_FMW_I_0002, R_TMF518_FMW_I_00 

* 03...\SD\SD2-7_ObjectNaming.pdf 

*/
protected ObjectName name ;




/**  
* Field discoveredName
* This attribute contains the name of the object when its existence is f 

* irst published on the CCV. </br>See R_TMF518_FMW_I_0001 and R_TMF518_F 

* MW_I_0003.This attribute contains the name of the object when its exis 

* tence is first published on the CCV but only in the case where the OS  

* that publishes the object on the CCV is not the naming OS. 

*/
protected String discoveredName ;




/**  
* Field aliasNameList
*/
protected List<AttributeValuePair> aliasNameList ;




/**  
* Field additionalInfo
* This attribute is a vendor specific attribute that contains additional 

*  specific information about the object. This list can be empty. </br>T 

* he attribute, when present, can be used to convey information from the 

*  target OS to the requesting OS, and vice versa, of additional informa 

* tion that isn't explicitly modelled, except that some parameter names  

* and values may be predefined. </br>Any information encoded in the addi 

* tionalInfo is optional: target OS need not fill out this information a 

* nd the requesting OS need not interpret this information. </br>See R_T 

* MF518_FMW_I_0001.This is a vendor specific attribute that contains add 

* itional specific information about the object. This list can be empty. 

*  </br>The attribute, when present, can be used to convey information f 

* rom the target OS to the requesting OS, and vice versa, of additional  

* information that isn't explicitly modelled, except that some parameter 

*  names and values may be predefined. </br>Any information encoded in t 

* he additionalInfo is optional: the target OS need not fill out this in 

* formation and the requesting OS need not interpret this information. 

*/
protected List<AttributeValuePair> additionalInfo ;




/**  
* Field managedentity
*/
protected ManagedEntity managedentity ;


}