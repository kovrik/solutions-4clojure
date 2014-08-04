; restrictions: distinct
; order of the items must be maintained
(defn dist [v]
  (reduce (fn [s e] (if (some #{e} s)
                      s
                      (conj s e)))
          [] v))

(= (dist [1 2 1 3 1 2 4]) [1 2 3 4])

(= (dist [:a :a :b :b :c :c]) [:a :b :c])

(= (dist '([2 4] [1 2] [1 3] [1 3])) '([2 4] [1 2] [1 3]))

(= (dist (range 50)) (range 50))