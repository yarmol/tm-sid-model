/**
* Converged Network ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3.g.iI8G.v_E.eK5.fY.h.h4RE.fW.w-content.html">Converged Network ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.converged_network_business_entity ;

/**
* The TerminationPointEncapsulation (TPE) represents one or more functio 
* ns that terminate/originate a signal that adapt a signal for use, and  
* that enable a signal to propagate. Hence a TPE can represent the end p 
* oint of a signal flow. The TPE can also represent the intermediate poi 
* nt of a signal flow.A TPE is capable of encapsulating multiple transpo 
* rt functions (G.805 termination functions, adapters, points etc.) at m 
* any different layers where the encapsulated transport functions are al 
* l related to the same signal flow.  The encapsulated layers may be exp 
* osed via usage of instances of LayerTermination (LT).The TPE deals equ 
* ivalently with unidirectional and bidirectional flows. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class TerminationPointEncapsulation extends LogicalResource,Resource,Entity,RootEntity {



/**  
* Field tpeType
* This attribute represents the name of the specification that describes 

*  the construction of the TPE emphasising for example the access to the 

*  TPE and whether it is associated with a physical port directly or not 

* . Amongst other things this attribute would identify whether the TPE i 

* s a PTP, CTP or FTP. 

*/
protected String tpeType ;




/**  
* Field asapRefList
* This attribute indicates the assignment of one or more Alarm Severity  

* Assignment Profiles (ASAP) to the TPE. 

*/
protected List<AlarmSeverityAssignmentProfile> asapRefList ;




/**  
* Field egressTmdRef
* Pointer to a Tmd associated with the traffic leaving the TPE (i.e. egr 

* ess). 

*/
protected TransmissionDescriptor egressTmdRef ;




/**  
* Field ingressTmdRef
* Pointer to a Tmd associated with the traffic arriving at the TPE (i.e. 

*  ingress). 

*/
protected TransmissionDescriptor ingressTmdRef ;




/**  
* Field protectedTpeRefList
* Identifies one other TPE that is in a protection relationship with the 

*  TPE with this pointer. 

*/
protected TerminationPointEncapsulation protectedTpeRefList ;




/**  
* Field supportedTpeRefList
* The list of TPEs supported by a specific equipment. 

*/
protected List<Equipment> supportedTpeRefList ;




/**  
* Field tpeInOtherViewRefList
* This attribute lists TPEs (in other name spaces) that represent at lea 

* st some of the same resources in the network as the referencing TPE. F 

* or example this supports the navigation between a fully virtualized TP 

* E and a TPE more closely bound to the physical equipment (such as the  

* relationship between an SNP of the ASON Control Plane and a CTP of the 

*  physical network). 

*/
protected List<TerminationPointEncapsulation> tpeInOtherViewRefList ;




/**  
* Field attachedTpeRefList
* Lists the TPEs that are attached to the PhysicalPort. 

*/
protected List<PhysicalPort> attachedTpeRefList ;




/**  
* Field encapsulatedLtList
* Pulls in the list of LTs describing the termination of protocol layers 

*  encapsulated in the TPE. 

*/
protected List<LayerTermination> encapsulatedLtList ;




/**  
* Field isEquipmentProtected
* This attribute indicates whether or not the TPE is supported by a prot 

* ected Equipment. 

*/
protected Boolean isEquipmentProtected ;




/**  
* Field egressTmdState
* This attribute contains the state of consistency between a TPE and its 

*  associated egress TransmissionDescriptor. 

*/
protected TransmissionDescriptorState egressTmdState ;




/**  
* Field ingressTmdState
* This attribute contains the state of consistency between a TPE and its 

*  associated ingress TransmissionDescriptor. 

*/
protected TransmissionDescriptorState ingressTmdState ;




/**  
* Field managedelement
*/
protected List<ManagedElement> managedelement ;


}