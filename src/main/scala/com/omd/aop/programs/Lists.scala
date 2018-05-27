package com.omd.aop.programs

import scalaz.Isomorphism.<~>


trait Lists { self: Isomorphisms ⇒
  final def cons[A](h: A, r: ListR[A]): ListR[A] = Cons(h, r)
  final def nilR[A]: ListR[A] = RNil

  final def snoc[A](h: ListL[A], r: A): ListL[A] = Snoc(h, r)
  final def nilL[A]: ListL[A] = LNil

  final def convert[A]: ListL[A] ⇒ ListR[A] = implicitly[ListL <~> ListR].to.apply
}