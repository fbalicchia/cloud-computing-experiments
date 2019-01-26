#Cloud computing experiments

Disclaimer: by no mean I'm expert in topic. all the info bellow is according to my best knowledge, which is corrently limitated and I'm learning as well in my own time after follow course

This project contains personal notes about experiments used to study and make hand on code on algorithm learned during course. In this folder is present code found around used to make my own experiments. I concentrate techical insights on P2P, distributed filesystem and consistency. To make these insights I've used different code base Java, C++ and GoLang. Golang independent from my backgroud is my choise cause I found it unbelievable ease and fast to read.

I' ve divided my notes in the following section 

## Membership

## DHT
  
  * implementation of CRUD operation
  * Load-balancing (via a consistent hashing ring to hash both servers and keys).
  * Fault-tolerance up to two failures (by replicating each key three times to three successive nodes in the ring, starting from the first node at or to the clockwise of the hashed key). 
  * Quorum consistency levelfor both reads and writes (at least two replicas). 
  * Stabilization after failure (recreate three replicas after failure).

## P2P

## Consistency