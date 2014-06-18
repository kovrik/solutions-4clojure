(defn replic [coll n]
  (mapcat #(replicate n %) coll))

(fn rep [coll n] (mapcat #(replicate n %) coll))

(= (replic [1 2 3] 2) '(1 1 2 2 3 3))

(= (replic [:a :b] 4) '(:a :a :a :a :b :b :b :b))

(= (replic [4 5 6] 1) '(4 5 6))

(= (replic [[1 2] [3 4]] 2) '([1 2] [1 2] [3 4] [3 4]))

(= (replic [44 33] 2) [44 44 33 33])
