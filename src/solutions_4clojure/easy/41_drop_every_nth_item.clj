(defn drp [coll n]
  ())

(= (drp [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8])

(= (drp [:a :b :c :d :e :f] 2) [:a :c :e])

(= (drp [1 2 3 4 5 6] 4) [1 2 3 5 6])
