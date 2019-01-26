## Consistency
This part of course was the most difficult from my point of view but very interesting. The thing that I don't like is done a very good over view of algorithms but don't provide a broad overview of real case. These case was founded in fantastic book " Design Data Intensive application" in chapter Problem that occured in distributed system..

An algorithm is written on base of formalization of type of fault in a particular the system type. A common system type are: (page 307)

* Synchronuos model 
* Partially synchronuos model
* Asynchronuos model

Moreover, time issue algorithm need to take in consideration node fault like.

* Crash-stop faults: System stop to response in any moment and never come back.

* Crash-recovery fault : algorithm need to ber consider that node can be crash and  the can be recoverd in unknow time. In this model node 
assume that have a stable storage where is possible to recover the state

* Byzantine fault: Fault arbitrary system and continue to operate correctly even some of node are malfunctional or not obeying the protocol. 


Correctness of an algorithm:

To defined correctness algorithm need to have the following properties:

* Uniqueness no two request for fencing token return the same value
* Monotonic sequence If request x returned from token tx and request y return token ty and x is completed before y then tx  < ty
* Availability a node that make request to other entity does not crash and eventually receive response.

for more clarify we can distinguish two properties Safety and liveness properties

* Safety can defined as *nothing bad happens* 

if a safety properties is violated Liveness can be defined as something good eventually happens
 
 "write here definition"


Consistency Model:

This notes come from jepsen.io consistency documentation and Design Data Intesive application page 329

Consistency model is a set of history and we can use this model to understand what is "legal" or "good" in a system or when something "violates serializability" or not
in serializability.

I make much confused between Linearizability And Serializability but are two guarantees and is important to distinguish between then.

Serializability:
is isolation property  of transaction where every transaction may read AND write Multiple object operation.(row, document or records). It's target is to garantee that
transaction is the same if executed in *some* serial order for example each transaction running to completation before the next one start and it's ok for that serial order to be different from the
order  in which transaction were actually run (Atomicity and Isolation)

Linearizability:
Linearizability garantees on read and write of registration. It' doesen't a group of transaction together in a transaction so it' doesn't prevent from "write skew problem". Write srew problem
can be generalizated as lost update.This problem can occur where 2 transaction read the same objects and one update one of then.

In linearizability system we have a total order of operation and have a single copy of data with all atomic operation. In this manner operation can only know the previous and secondary operation.

[Jepsen reference consistency](https://jepsen.io/consistency)



* Consensus

This is one the most important concept in distribuited system and IMHO is the most difficult cause my understand grow every time a read about of it. 
The basically concept is very tiny ... much node agree on something. In the distributed system consensus algoritm can be used

* Leader Election
* Atomic commit
* Atomic transaction decision.

Consensus Algoritm need to be satify the following properties :
* Agreement all correct node decide for the same value
* Termination all correct node teminate in finete time
* Validity Decision value must be the input value of node.
    
Impossibility of consensus. TO BE DONE