(defn compress [s]
  (map first (partition-by identity s)))

(= (apply str (compress "Leeeeeerrroyyy")) "Leroy")

(= (compress [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))

(= (compress [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))
