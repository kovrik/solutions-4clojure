(defn drp [coll n]
  (loop [res []
         c coll
         i 1]
    (if (empty? c)
      res
      (recur (if (= 0 (mod i n))
                res
                (conj res (first c)))
             (rest c)
             (inc i)))))

(= (drp [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8])

(= (drp [:a :b :c :d :e :f] 2) [:a :c :e])

(= (drp [1 2 3 4 5 6] 4) [1 2 3 5 6])
