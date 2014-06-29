(defn infix [& args]
  (loop [res (first args)
         ops (rest args)]
    (let [op (first ops)
          l  res
          r  (second ops)]
      (if (empty? ops)
        res
        (recur (op l r) (drop 2 ops))))))

(defn infix [& args]
  (reduce (fn [a [op b]] (op a b))
          (first args)
          (partition 2 (rest args))))


(= 7  (infix 2 + 5))

(= 42 (infix 38 + 48 - 2 / 2))

(= 8  (infix 10 / 2 - 1 * 2))

(= 72 (infix 20 / 2 + 2 + 4 + 8 - 6 - 10 * 9))
