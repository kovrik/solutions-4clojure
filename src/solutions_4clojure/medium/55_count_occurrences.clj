; restrictions: frequencies
(defn co [c]
  (apply hash-map (mapcat #(vector (first %) (count %)) (partition-by identity (sort c)))))

(defn co [c]
  (into {} (for [[k v] (group-by identity c)]
              [k (count v)])))

(= (co [1 1 2 3 2 1 1]) {1 4, 2 2, 3 1})

(= (co [:b :a :b :a :b]) {:a 2, :b 3})

(= (co '([1 2] [1 3] [1 3])) {[1 2] 1, [1 3] 2})
