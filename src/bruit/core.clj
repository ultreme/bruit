(ns bruit.core
  (:require [overtone.live :refer :all]))

(definst bruit [freq 440]
  (let [env (env-gen (perc 0.01 2) :action FREE)]
    (* env (sin-osc freq))))

(bruit)
